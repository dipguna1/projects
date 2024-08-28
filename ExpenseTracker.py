import datetime
import matplotlib.pyplot as plt

class Expense:
    def _init_(self, name, cost, date):
        self.name = name
        self.cost = cost
        self.date = date

    def _str_(self):
        return f"{self.name}: ${self.cost} on {self.date.strftime('%Y-%m-%d')}"

class ExpenseTracker:
    def _init_(self):
        self.expenses = []

    def add_expense(self, name, cost, date):
        if not isinstance(name, str):
            raise ValueError("Name must be a string")
        if not isinstance(cost, (int, float)):
            raise ValueError("Cost must be a number")
        if not isinstance(date, datetime.date):
            raise ValueError("Date must be a datetime.date object")
        self.expenses.append(Expense(name, cost, date))
        print()

    def view_all_expenses(self, sort_by='date'):
        if sort_by == 'date':
            sorted_expenses = sorted(self.expenses, key=lambda x: x.date)
        elif sort_by == 'cost':
            sorted_expenses = sorted(self.expenses, key=lambda x: x.cost)
        else:
            raise ValueError("Invalid sort_by value")
        for expense in sorted_expenses:
            print(expense)
        print()

    def delete_expense(self, index):
        if not isinstance(index, int) or index < 0 or index >= len(self.expenses):
            raise ValueError("Invalid index")
        del self.expenses[index]
        print(f"index {index} expance is deleted.")
        print()

    def filter_expenses(self, name=None, date_range=None):
        filtered_expenses = []
        for expense in self.expenses:
            if name and expense.name.lower() != name.lower():
                continue
            if date_range:
                if expense.date < date_range[0] or expense.date >date_range[1]:
                    continue
            filtered_expenses.append(expense)
        return filtered_expenses

    def save_expenses(self, filename):
        with open(filename, 'w') as f:
            for expense in self.expenses:
                f.write(f"{expense.name},{expense.cost},{expense.date}\n")
        print('Your expances is saved.')
        print()
        
    def view_total_cost(self):
        print(f"Total cost: {sum(expense.cost for expense in self.expenses)}")
        print()

    def view_cost_range(self, min_cost, max_cost):
        filtered_expenses = [expense for expense in self.expenses if min_cost <= expense.cost <= max_cost]
        for i in filtered_expenses:
            print(i)
        total_cost_range=0
        for i in filtered_expenses:
            total_cost_range+=i.cost
        print(f"Total cost in range: {total_cost_range}")
        print()

    def view_date_range(self, start_date, end_date):
        filtered_expenses = [expense for expense in self.expenses if start_date <= expense.date <= end_date]
        for i in filtered_expenses:
            print(i)
        date_range_total=0
        for i in filtered_expenses:
            date_range_total+=i.cost
        print(f"Total expance in date range :{date_range_total}")
        print()
        
    def view_day(self, date):
        filtered_expenses = [expense for expense in self.expenses if expense.date == date]
        for i in filtered_expenses:
            print(i)
        day_total=0
        for i in filtered_expenses:
            day_total+=i.cost
        print(f"Total expance in one day :{day_total}")
        print()
        
    def clear_expenses(self):
        self.expenses = []

    def view_expense_chart(self):
        dates = [expense.date for expense in self.expenses]
        costs = [expense.cost for expense in self.expenses]
        plt.gca().xaxis_date()
        plt.gcf().autofmt_xdate()
        plt.xlabel("date")
        plt.ylabel("cost")
        plt.title(": : Expense Chart : :")
        plt.plot(dates, costs)
        plt.show()

    def execute_command(self, command):
        match command:
            case '1':
                name = input("Enter expense name: ")
                cost = float(input("Enter expense cost: "))
                date = datetime.date.fromisoformat(input("Enter expense date (YYYY-MM-DD): "))
                self.add_expense(name, cost, date)
            case '2':
                sort_by = input("Sort by date (d) or cost (c)? ").lower()
                if sort_by == 'd':
                    self.view_all_expenses(sort_by='date')
                elif sort_by == 'c':
                    self.view_all_expenses(sort_by='cost')
                else:
                    raise ValueError("Invalid sort_by value")
            case '3':
                index = int(input("Enter expense index to delete: "))
                self.delete_expense(index)
            case '4':
                name = input("Enter expense name to filter by: ").lower()
                start_date = datetime.date.fromisoformat(input("Enter start date of date range (YYYY-MM-DD): "))
                end_date = datetime.date.fromisoformat(input("Enter end date of date range (YYYY-MM-DD): "))
                filtered_expenses = self.filter_expenses(name, (start_date, end_date))
                print("Filtered expenses:")
                for expense in filtered_expenses:
                    print(expense)
                print()
            case '5':
                filename = input("Enter filename to save expenses to: ")
                self.save_expenses(filename)
            case '6':
                self.view_total_cost()
            case '7':
                min_cost = float(input("Enter minimum cost: "))
                max_cost = float(input("Enter maximum cost: "))
                self.view_cost_range(min_cost, max_cost)
            case '8':
                start_date = datetime.date.fromisoformat(input("Enter start date of date range (YYYY-MM-DD): "))
                end_date = datetime.date.fromisoformat(input("Enter end date of date range (YYYY-MM-DD): "))
                self.view_date_range(start_date, end_date)
            case '9':
                date = datetime.date.fromisoformat(input("Enter date to view expenses for (YYYY-MM-DD): "))
                self.view_day(date)
            case '10':
                self.clear_expenses()
            case '11':
                self.view_expense_chart()
            case '':
                print("Invalid command")
et = ExpenseTracker()
while True:
    command = input("Enter command \n1. Add Expance\n2. View Expance\n3. Delete Expance\n4. Filter Expance\n5. Save Expance\n6. Total of Expance\n7. View Cost-range wise\n8. View Date-range wise\n9. View Day wise\n10. Clear All expances\n11. Chart of expances\n12. quit\n ")
    if command == '12':
        break
    et.execute_command(command)