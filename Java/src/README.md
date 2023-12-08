# OOP
# HỆ THỐNG CÁC LOẠI PHƯƠNG TIỆN
## TỔNG QUAN
Dự án về các loại phương tiện giao thông như ô tô, xe bán tải, xe đạp, thuyền.
Mỗi loại phương tiện xuất hiện ở một lớp cụ thể kế thừa từ lớp chung 'Vehicle'. 
Hệ thống cũng tích hợp giao diện 'EngineFuel' để xử lý các phương tiện có thể nạp nhiên liệu.
### USE
Sử dụng Clas 'Main' để kiểm thử chức năng của mô hình phương tiện.
Tạo các đối tượng và kiểm tra đặc điểm chung và độc đáo của từng loại phương tiện.
Gọi 'fuelLoading' từ giao diện 'EngineFuel' để mô phổng việc nạp nhiên liệu
### CLASS
#### 1.Vehicle
Clas 'Vehicle' là lớp cơ sở cho tất cả các phương tiện trong hệ thống.
Chứa các thuộc tính chung như tốc độ, dung tích và cung cấp phương thức 'start()' để mô phỏng việc khởi động các loại phương tiện.
#### 2.Car
Class 'Car' extends from class 'Vehicle' và triển khai interface 'EngineFuel' bên Class 'Main'. Nó chứa các thuộc tính đặc biệt như số lượng cốp xe, số chỗ ngồi của xe. Sử dụng @Override void startEngine() để cung cấp hành động cụ thể cho ô tô. Getter và setter methods: Cho phép truy cập và thiết lập giá trị của các đặc điểm độc đáo.
#### 3.Truck
Class 'Truck' extends from class 'Vehicle' và  triển khai interface 'EngineFuel' bên Class 'Main'. Chứa các thuốc tính đặc biệt như số chỗ ngồi, loại động cơ. Sử dụng @Override void startEngine() để cung cấp hành động cụ thể cho ô tô. Getter và setter methods: Cho phép truy cập và thiết lập giá trị của các đặc điểm độc đáo.
#### 4.Bike
Class 'Bike' extends from class 'Vehicle' . Chứa thuộc tính đặc biệt như số lượng giỏ xe. Sử dụng @Override void startEngine() để cung cấp hành động cụ thể cho ô tô. Getter và setter methods: Cho phép truy cập và thiết lập giá trị của các đặc điểm độc đáo.
#### 5.Boat
Class 'Boat' extends from class 'Vehicle'. Chứa thuộc tính đặc biệt là có tubin đẩy dưới nước. Sử dụng @Override void startEngine() để cung cấp hành động cụ thể cho ô tô. Getter và setter methods: Cho phép truy cập và thiết lập giá trị của các đặc điểm độc đáo.
