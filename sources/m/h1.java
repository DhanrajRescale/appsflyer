package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class h1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) i1.e("getHorizontallyScrolling", textView, Boolean.FALSE)).booleanValue();
    }
}
