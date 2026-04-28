<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, model.Employee, dao.EmployeeDao" %>
<%
    EmployeeDao dao = new EmployeeDao();
    List<Employee> employees = dao.getAll();
%>

<html>
<head>
    <title>Employee List</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow">
        <div class="card-header bg-primary text-white">
            <h4 class="mb-0">Employee List</h4>
        </div>
        <div class="card-body">
            <table class="table table-striped table-hover">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Designation</th>
                        <th>Salary</th>
                        <th>Joining Date</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                <%
                    for(Employee emp : employees){
                %>
                    <tr>
                        <td><%= emp.getId() %></td>
                        <td><%= emp.getName() %></td>
                        <td><%= emp.getDesignation() %></td>
                        <td><%= emp.getSalary() %></td>
                        <td><%= emp.getJoiningDate() %></td>
                        <td>
                            <!-- Edit Button -->
                            <a href="EmployeeServlet?action=edit&id=<%= emp.getId() %>" 
                               class="btn btn-sm btn-warning">Edit</a>
                            <!-- Delete Button -->
                            <a href="EmployeeServlet?action=delete&id=<%= emp.getId() %>" 
                               class="btn btn-sm btn-danger"
                               onclick="return confirm('Are you sure you want to delete this employee?');">
                               Delete
                            </a>
                        </td>
                    </tr>
                
                </tbody>
            </table>

            <!-- Add Employee Button -->
            <div class="mt-3">
                <a href="pages/add.jsp" class="btn btn-success">Add New Employee</a>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>


</body>
</html>
