package kl;

import android.view.View;
import androidx.work.u;
import cl.g;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import nl.n0;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import r5.z;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet f23258e = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f23259a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f23260b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f23261c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23262d;

    public f(View view, View view2, String str) {
        this.f23259a = g.e(view);
        this.f23260b = new WeakReference(view2);
        this.f23261c = new WeakReference(view);
        if (str != null) {
            String lowerCase = str.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            this.f23262d = s.n(lowerCase, "activity", HttpUrl.FRAGMENT_ENCODE_SET, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final void a() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            View view = (View) this.f23260b.get();
            View view2 = (View) this.f23261c.get();
            if (view != null && view2 != null) {
                try {
                    String d10 = c.d(view2);
                    String b10 = b.b(view2, d10);
                    if (b10 == null || u.p(b10, d10)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", c.b(view, view2));
                    jSONObject.put("screenname", this.f23262d);
                    if (!sl.a.b(this)) {
                        try {
                            n0.Q(new z(jSONObject, d10, this, b10, 1));
                        } catch (Throwable th2) {
                            sl.a.a(this, th2);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th3) {
            sl.a.a(this, th3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            View.OnClickListener onClickListener = this.f23259a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            a();
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
