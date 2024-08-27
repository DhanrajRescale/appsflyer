package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final v1 f1817a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final x1 f1818b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.fragment.app.v1] */
    static {
        x1 x1Var;
        try {
            x1Var = (x1) t7.l.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            x1Var = null;
        }
        f1818b = x1Var;
    }

    public static final void a(int i10, ArrayList views) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
