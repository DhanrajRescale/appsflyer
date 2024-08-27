package i5;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r5.n f19667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r5.s f19668c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f19669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f19670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f19672g;

    public /* synthetic */ x0(Object obj, Object obj2, r5.n nVar, r5.s sVar, IOException iOException, boolean z10, int i10) {
        this.f19666a = i10;
        this.f19671f = obj;
        this.f19672g = obj2;
        this.f19667b = nVar;
        this.f19668c = sVar;
        this.f19669d = iOException;
        this.f19670e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f19666a;
        Object obj = this.f19672g;
        Object obj2 = this.f19671f;
        switch (i10) {
            case 0:
                Pair pair = (Pair) obj;
                r5.n nVar = this.f19667b;
                r5.s sVar = this.f19668c;
                IOException iOException = this.f19669d;
                boolean z10 = this.f19670e;
                ((j5.w) ((a1) ((tr.e) obj2).f36362c).f19352h).M(((Integer) pair.first).intValue(), (r5.w) pair.second, nVar, sVar, iOException, z10);
                return;
            default:
                l0.j jVar = (l0.j) obj2;
                ((r5.b0) obj).M(jVar.f23773a, (r5.w) jVar.f23774b, this.f19667b, this.f19668c, this.f19669d, this.f19670e);
                return;
        }
    }
}
