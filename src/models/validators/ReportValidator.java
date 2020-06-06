package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }
public static List<Integer>validate1(Report r) {
        List<Integer> errors = new ArrayList<Integer>();
        Integer begin_error = _validateBegin(r.getBegin_time());
        if(!begin_error.equals("")){
            errors.add(begin_error);
        }

        Integer finish_error = _validateFinish(r.getFinish_time());
        if(!finish_error.equals("")){
            errors.add(finish_error);

        return errors;

        }
        return errors;
    }

    private static String _validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
            }

        return "";
    }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
            }

        return "";
    }

    private static Integer _validateBegin(Integer begin_time) {
        if(begin_time == null || begin_time.equals("")) {
            return begin_time ;
        }
        return begin_time ;
    }

    private static Integer _validateFinish(Integer finish_time) {
        if(finish_time == null || finish_time.equals("")) {
            return finish_time ;
        }
        return finish_time ;
    }
}
