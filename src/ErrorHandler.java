import org.antlr.v4.runtime.*;

public class ErrorHandler extends BaseErrorListener {

    private final String fase;

    public ErrorHandler(String fase) {
        this.fase = fase;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        String error = String.format(
            "[ ERROR %s ] Línea %d:%d → %s",
            fase, line, charPositionInLine, msg
        );
        System.err.println(error);
    }
}