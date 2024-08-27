package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class n0 extends l0 {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f1774a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1775b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1776c;

    /* renamed from: d, reason: collision with root package name */
    public final e1 f1777d;

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.fragment.app.d1, androidx.fragment.app.e1] */
    public n0(j0 j0Var) {
        Handler handler = new Handler();
        this.f1777d = new d1();
        this.f1774a = j0Var;
        this.f1775b = j0Var;
        this.f1776c = handler;
    }
}
