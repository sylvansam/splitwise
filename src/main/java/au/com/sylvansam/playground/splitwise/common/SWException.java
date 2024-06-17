package au.com.sylvansam.playground.splitwise.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SWException extends RuntimeException {

    private SWExceptionCategory category;
    private String message;

    public SWException(SWExceptionCategory category, String message) {
        super(category.name() + " --> " + message);
        this.category = category;
        this.message = message;
    }

}