<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Quản Lý Sản Phẩm</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container mt-4">
    <h1 class="mb-4">Quản Lý Sản Phẩm</h1>

    <form method="post" action="product">
      <div class="mb-3">
        <label for="tenSanPham" class="form-label">Tên sản phẩm</label>
        <input type="text" id="tenSanPham" name="tenSanPham" class="form-control">
      </div>

      <div class="mb-3">
        <label for="soLuong" class="form-label">Số lượng:</label>
        <input type="text" id="soLuong" name="soLuong" class="form-control">
      </div>

      <div class="mb-3">
        <label for="giaBan" class="form-label">Giá bán:</label>
        <input type="text" id="giaBan" name="giaBan" class="form-control">
      </div>

      <button type="submit" class="btn btn-primary">Lưu lại</button>
    </form>

    <table class="table table-bordered mt-4">
      <thead class="table-light">
        <tr>
          <th scope="col">STT</th>
          <th scope="col">Tên Sản Phẩm</th>
          <th scope="col">Số Lượng</th>
          <th scope="col">Giá Bán</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="p" items="${productList}" varStatus="status">
          <tr>
            <td>${status.index + 1}</td>
            <td>${p.tenSanPham}</td>
            <td>${p.soLuong}</td>
            <td>${p.giaBan}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</body>
</html>
