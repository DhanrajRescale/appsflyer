package os;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import ls.n0;

/* loaded from: classes2.dex */
public final class d implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f30300a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f30301b;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f30303d = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final a f30302c = new a(this);

    public d(n0 n0Var, t tVar) {
        this.f30300a = n0Var;
        this.f30301b = tVar;
    }

    public static String a(View view) {
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text == null) {
                return null;
            }
            return text.toString();
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount && sb2.length() < 128; i10++) {
            String a10 = a(viewGroup.getChildAt(i10));
            if (a10 != null && a10.length() > 0) {
                if (z10) {
                    sb2.append(", ");
                }
                sb2.append(a10);
                z10 = true;
            }
        }
        if (sb2.length() > 128) {
            return sb2.substring(0, 128);
        }
        if (!z10) {
            return null;
        }
        return sb2.toString();
    }
}
