<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Employee" %>
<%
    Employee emp = (Employee) request.getAttribute("employee");
%>
<html>
<head>
    <title>Edit Employee</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow">
        <div class="card-header bg-warning text-dark">
            <h4 class="mb-0">Edit Employee</h4>
        </div>
        <div class="card-body">
            <form action="${pageContext.request.contextPath}/EmployeeServlet" method="post">
                <input type="hidden" name="id" value="<%= emp.getId() %>">

                <div class="mb-3">
                    <label class="form-label">Name</label>
                    <input type="text" name="name" class="form-control" value="<%= emp.getName() %>" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Designation</label>
                    <input type="text" name="designation" class="form-control" value="<%= emp.getDesignation() %>" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Salary</label>
                    <input type="number" step="0.01" name="salary" class="form-control" value="<%= emp.getSalary() %>" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Joining Date</label>
                    <input type="date" name="joiningDate" class="form-control" value="<%= emp.getJoiningDate() %>" required>
                </div>

                <div class="d-grid">
                    <button type="submit" name="action" value="update" class="btn btn-warning">Update Employee</button>
                </div>
            </form>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <script>
        function validateForm() {
            const name = document.getElementById('name').value.trim();
            const designation = document.getElementById('designation').value.trim();
            const salary = document.getElementById('salary').value.trim();
            const joiningDate = document.getElementById('joiningDate').value.trim();
            
            if (!name || !designation || !salary || !joiningDate) {
                alert('Please fill all required fields!');
                return false;
            }
            
            if (name.length < 3) {
                alert('Name should be at least 3 characters long!');
                return false;
            }
            
            if (salary <= 0) {
                alert('Salary must be greater than 0!');
                return false;
            }
            
            return confirm('Are you sure you want to update this employee record?');
        }
    </script>
</body>
</html>
