package d4;

import android.view.ContentInfo;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class j1 {
    public static String[] a(@NonNull View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static h b(@NonNull View view, @NonNull h hVar) {
        ContentInfo m10 = hVar.f13744a.m();
        Objects.requireNonNull(m10);
        ContentInfo g10 = a4.c.g(m10);
        ContentInfo performReceiveContent = view.performReceiveContent(g10);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == g10) {
            return hVar;
        }
        return new h(new t9.c(performReceiveContent));
    }

    public static void c(@NonNull View view, String[] strArr, e0 e0Var) {
        if (e0Var == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new k1(e0Var));
        }
    }
}
