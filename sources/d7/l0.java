package d7;

import android.text.Html;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f14065a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f14065a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
