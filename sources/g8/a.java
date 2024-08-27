package g8;

import android.content.Context;
import android.os.Build;
import androidx.work.v;
import h8.f;
import h8.g;
import h8.h;
import j8.k;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17167e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, m8.a aVar, int i10) {
        super((h8.a) h.h(context, aVar).f18056b);
        this.f17167e = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    } else {
                        super((g) h.h(context, aVar).f18059e);
                        return;
                    }
                }
                super((f) h.h(context, aVar).f18058d);
                return;
            }
            super((f) h.h(context, aVar).f18058d);
            return;
        }
        super((h8.b) h.h(context, aVar).f18057c);
    }

    @Override // g8.c
    public final boolean a(k kVar) {
        switch (this.f17167e) {
            case 0:
                return kVar.f21083j.f2553b;
            case 1:
                return kVar.f21083j.f2555d;
            case 2:
                if (kVar.f21083j.f2552a == v.f2639b) {
                    return true;
                }
                return false;
            case 3:
                v vVar = kVar.f21083j.f2552a;
                if (vVar == v.f2640c) {
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 30 && vVar == v.f2643f) {
                    return true;
                }
                return false;
            default:
                return kVar.f21083j.f2556e;
        }
    }

    @Override // g8.c
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f17167e) {
            case 0:
                return f((Boolean) obj);
            case 1:
                return f((Boolean) obj);
            case 2:
                return e((f8.a) obj);
            case 3:
                return e((f8.a) obj);
            default:
                return f((Boolean) obj);
        }
    }

    public final boolean e(f8.a aVar) {
        switch (this.f17167e) {
            case 2:
                if (Build.VERSION.SDK_INT >= 26) {
                    if (!aVar.f15979a || !aVar.f15980b) {
                        return true;
                    }
                    return false;
                }
                return true ^ aVar.f15979a;
            default:
                if (!aVar.f15979a || aVar.f15981c) {
                    return true;
                }
                return false;
        }
    }

    public final boolean f(Boolean bool) {
        switch (this.f17167e) {
            case 0:
                return !bool.booleanValue();
            case 1:
                return !bool.booleanValue();
            default:
                return !bool.booleanValue();
        }
    }
}
