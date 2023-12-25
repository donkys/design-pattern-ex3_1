public interface ICEO extends IEmployee, IBonus {
    //for ceo
    void makeDecisions();
    void addStocks();

    //for manager and ceo
    // void addBonus();  
    /* 
        "นักศึกษาไม่จําเป็นต้องสนใจเรื่องของ code duplication" จากโจทย์ที่ได้รับเข้าใจว่าเป็นอย่างนี้ หรือให้สร้าง Interface IBonus เพื่อให้ CEO และ Manager สืบทอดมาใช้
        หรือที่บอกว่า code duplication คือตอน extend ใน Employee ไม่ต้องสนใจว่าจะ print salary() อันเดียวกันกับ CEO และ Manager
    */
}