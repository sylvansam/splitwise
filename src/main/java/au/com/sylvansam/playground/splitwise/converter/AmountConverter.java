package au.com.sylvansam.playground.splitwise.converter;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

@Component
public class AmountConverter {

    private static final BigDecimal currencyDivisor = new BigDecimal(100);
    private static final DecimalFormat formatter = new DecimalFormat("$#,##0.00");
    private static final int currencyScale = 2;

    public String getDisplayAmount(int amount) {
        BigDecimal amtBD = new BigDecimal(amount)
                .divide(currencyDivisor, currencyScale, RoundingMode.HALF_UP);
        return formatter.format(amtBD);
    }
}
