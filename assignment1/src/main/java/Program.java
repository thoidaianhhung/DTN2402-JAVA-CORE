

import java.time.LocalDate;
import java.time.LocalTime;

public class Program {
    public static void main(String[] args) {
        // Table Department
        Department department = new Department();
        department.departmentId = 1;
        department.departmentName = DepartmentName.SALE;
        System.out.println("department.departmentId = " + department.departmentId);
        System.out.println("department.departmentName = " + department.departmentName);
        department.departmentId = 2;
        department.departmentName = DepartmentName.MARKETING;
        System.out.println("department.departmentId = " + department.departmentId);
        System.out.println("department.departmentName = " + department.departmentName);
        department.departmentId = 3;
        department.departmentName = DepartmentName.MANAGER;
        System.out.println("department.departmentId = " + department.departmentId);
        System.out.println("department.departmentName = " + department.departmentName);

        // Table Position
        Position position = new Position();
        position.positionId = 1;
        position.positionName = PositionName.DEV;
        System.out.println("position.positionId = " + position.positionId);
        System.out.println("position.positionName = " + position.positionName);
        position.positionId = 2;
        position.positionName = PositionName.TEST;
        System.out.println("position.positionId = " + position.positionId);
        System.out.println("position.positionName = " + position.positionName);
        position.positionId = 3;
        position.positionName = PositionName.PM;
        System.out.println("position.positionId = " + position.positionId);
        System.out.println("position.positionName = " + position.positionName);

        // Table Account
        Account account = new Account();
        account.accountId = 1;
        account.email = "hungnv@gmail.com";
        account.userName = "hungnv";
        account.fullName = "Nguyễn Văn Hùng";
        account.departmentId = department;
        account.positionId = position;
        account.createDate = LocalDate.of(2022, 3, 12);
        System.out.println("account.accountId = " + account.accountId);
        System.out.println("account.email = " + account.email);
        System.out.println("account.userName = " + account.userName);
        System.out.println("account.fullName = " + account.fullName);
        System.out.println("account.departmentId = " + account.departmentId);
        System.out.println("account.positionId = " + account.positionId);
        System.out.println("account.createDate = " + account.createDate);

        // Table Group
        Group group = new Group();
        group.groupId = 1;
        group.groupName = "Java";
        group.creatorId = account;
        group.createDate = LocalDate.of(2022, 3, 23);
        System.out.println("group.groupId = " + group.groupId);
        System.out.println("group.groupName = " + group.groupName);
        System.out.println("group.creatorId = " + group.creatorId);
        System.out.println("group.createDate = " + group.createDate);

        // Table GroupAccount
        GroupAccount groupAccount = new GroupAccount();
        groupAccount.groupId = group;
        groupAccount.accountId = account;
        groupAccount.joinDate = LocalDate.of(2022, 4, 13);
        System.out.println("groupAccount.groupId = " + groupAccount.groupId);
        System.out.println("groupAccount.accountId = " + groupAccount.accountId);
        System.out.println("groupAccount.joinDate = " + groupAccount.joinDate);

        // Table TypeQuestion
        TypeQuestion typeQuestion = new TypeQuestion();
        typeQuestion.typeId = 1;
        typeQuestion.typeName = TypeName.ESSAY;
        System.out.println("typeQuestion.typeId = " + typeQuestion.typeId);
        System.out.println("typeQuestion.typeName = " + typeQuestion.typeName);

        // Table CategoryQuestion
        CategoryQuestion categoryQuestion = new CategoryQuestion();
        categoryQuestion.categoryId = 1;
        categoryQuestion.categoryname = CategoryName.JAVA;
        System.out.println("categoryQuestion.categoryId = " + categoryQuestion.categoryId);
        System.out.println("categoryQuestion.categoryname = " + categoryQuestion.categoryname);

        // Table Question
        Question question = new Question();
        question.questionId = 1;
        question.content = "Câu hỏi java";
        question.categoryId = categoryQuestion;
        question.typeId = typeQuestion;
        question.creatorId = account;
        question.createDate = LocalDate.of(2022, 4, 12);
        System.out.println("question.questionId = " + question.questionId);
        System.out.println("question.content = " + question.content);
        System.out.println("question.categoryId = " + question.categoryId);
        System.out.println("question.typeId = " + question.typeId);
        System.out.println("question.creatorId = " + question.creatorId);
        System.out.println("question.createDate = " + question.createDate);

        // Table Answer
        Answer answer = new Answer();
        answer.answerId = 1;
        answer.content = "Câu trả lời java";
        answer.questionId = question;
        answer.isCorrect = true;
        System.out.println("answer.answerId = " + answer.answerId);
        System.out.println("answer.content = " + answer.content);
        System.out.println("answer.questionId = " + answer.questionId);
        System.out.println("answer.questionId = " + answer.questionId);
        System.out.println("answer.isCorrect = " + true);

        // Table Exam
        Exam exam = new Exam();
        exam.examId = 1;
        exam.code = "VTI001";
        exam.title = "Thi JAVA";
        exam.categoryId = categoryQuestion;
        exam.duration = LocalTime.of(1, 30,10);
        exam.createDate = LocalDate.of(2002, 3, 13);
        System.out.println("exam.examId = " + exam.examId);
        System.out.println("exam.code = " + exam.code);
        System.out.println("exam.title = " + exam.title);
        System.out.println("exam.categoryId = " + exam.categoryId);
        System.out.println("exam.duration = " + exam.duration);
        System.out.println("exam.createDate = " + exam.createDate);

        // Table ExamQuestion
        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.examId = exam;
        examQuestion.questionId = question;
        System.out.println("examQuestion.examId = " + examQuestion.examId);
        System.out.println("examQuestion.questionId = " + examQuestion.questionId);
    }
}
