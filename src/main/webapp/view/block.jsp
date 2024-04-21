<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Block</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>
        <div class="d-flex align-items-center justify-content-center vh-100">
            <div class="text-center row">
                <div class=" col-md-6">
                    <img src="https://cdn.pixabay.com/photo/2017/03/09/12/31/error-2129569__340.jpg" alt=""
                        class="img-fluid">
                </div>
                <div class=" col-md-6 mt-5">
                    <p class="fs-3"> <span class="text-danger">Opps!</span> Tài Khoản Bị Vô Hiệu Hóa.</p>
                    <p class="lead">
                        Xin Chào: ${fullName} Tài Khoản Của Bạn Đã Bị Vô Hiệu Hóa.
                        <br>
                        Vì Vi Phạm Nguyên Tắt Cộng Đồng Của Chúng Tôi
                    </p>
                    <a href="/asm2/home" class="btn btn-primary">Go Home</a>
                </div>

            </div>
        </div>
    </body>

</html>