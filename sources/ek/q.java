package ek;

import android.content.Context;

/* loaded from: classes.dex */
public final class q implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15615a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15616b;

    public /* synthetic */ q(Context context, int i10) {
        this.f15615a = i10;
        this.f15616b = context;
    }

    @Override // ek.x
    public final w f(c0 c0Var) {
        int i10 = this.f15615a;
        Context context = this.f15616b;
        switch (i10) {
            case 0:
                return new s(context, 0);
            default:
                return new s(context, 1);
        }
    }
}
