
public final class HtmlFilter {

    public static String filter(String message) {
            if (message == null) return null;
            int len = message.length();
            StringBuffer result = new StringBuffer(len + 20);
            char aChar;

            for (int i = 0; i < len; ++i) {
                aChar = message.charAt(i);
                switch (aChar) {
                    case '<': result.append("&lt;"); break;
                    case '>': result.append("&gt;"); break;
                    case '&': result.append("&amp;"); break;
                    case '"': result.append("&quot;"); break;
                    default:  result.append(aChar);
                }
            }
            return (result.toString());
        }
    }

