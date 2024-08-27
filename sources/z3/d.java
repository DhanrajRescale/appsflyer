package z3;

import android.content.Context;
import java.util.concurrent.Callable;
import m.s;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f41987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f41988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f41989e;

    public /* synthetic */ d(String str, Context context, s sVar, int i10, int i11) {
        this.f41985a = i11;
        this.f41986b = str;
        this.f41987c = context;
        this.f41988d = sVar;
        this.f41989e = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f41986b;
        Context context = this.f41987c;
        s sVar = this.f41988d;
        int i10 = this.f41989e;
        int i11 = this.f41985a;
        switch (i11) {
            case 0:
                switch (i11) {
                    case 0:
                        return g.a(str, context, sVar, i10);
                    default:
                        try {
                            return g.a(str, context, sVar, i10);
                        } catch (Throwable unused) {
                            return new f(-3);
                        }
                }
            default:
                switch (i11) {
                    case 0:
                        return g.a(str, context, sVar, i10);
                    default:
                        try {
                            return g.a(str, context, sVar, i10);
                        } catch (Throwable unused2) {
                            return new f(-3);
                        }
                }
        }
    }
}
