package k5;

import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22149c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22151e;

    public /* synthetic */ l(Object obj, int i10, long j10, long j11, int i11) {
        this.f22147a = i11;
        this.f22151e = obj;
        this.f22148b = i10;
        this.f22149c = j10;
        this.f22150d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r5.w wVar;
        int i10 = this.f22147a;
        Object obj = this.f22151e;
        switch (i10) {
            case 0:
                final int i11 = this.f22148b;
                final long j10 = this.f22149c;
                final long j11 = this.f22150d;
                i5.d0 d0Var = (i5.d0) ((tr.e) obj).f36362c;
                int i12 = e5.x.f15050a;
                j5.w wVar2 = (j5.w) d0Var.f19384a.f19472r;
                final j5.b U = wVar2.U();
                final int i13 = 0;
                wVar2.V(U, 1011, new e5.j(U, i11, j10, j11, i13) { // from class: j5.k

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f20987a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f20988b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ int f20989c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ long f20990d;

                    {
                        this.f20987a = i13;
                    }

                    @Override // e5.j
                    public final void invoke(Object obj2) {
                        long longValue;
                        switch (this.f20987a) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                a0 a0Var = (a0) ((c) obj2);
                                a0Var.getClass();
                                b bVar = this.f20988b;
                                r5.w wVar3 = bVar.f20966d;
                                if (wVar3 != null) {
                                    String c10 = a0Var.f20938b.c(bVar.f20964b, wVar3);
                                    HashMap hashMap = a0Var.f20944h;
                                    Long l10 = (Long) hashMap.get(c10);
                                    HashMap hashMap2 = a0Var.f20943g;
                                    Long l11 = (Long) hashMap2.get(c10);
                                    long j12 = 0;
                                    if (l10 == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l10.longValue();
                                    }
                                    hashMap.put(c10, Long.valueOf(longValue + this.f20990d));
                                    if (l11 != null) {
                                        j12 = l11.longValue();
                                    }
                                    hashMap2.put(c10, Long.valueOf(j12 + this.f20989c));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final int i14 = this.f22148b;
                final long j12 = this.f22149c;
                final long j13 = this.f22150d;
                j5.w wVar3 = (j5.w) ((v5.b) obj).f37700b;
                j5.v vVar = wVar3.f21014d;
                if (vVar.f21006b.isEmpty()) {
                    wVar = null;
                } else {
                    wVar = (r5.w) lp.g0.f(vVar.f21006b);
                }
                final j5.b S = wVar3.S(wVar);
                final int i15 = 1;
                wVar3.V(S, 1006, new e5.j(S, i14, j12, j13, i15) { // from class: j5.k

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f20987a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f20988b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ int f20989c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ long f20990d;

                    {
                        this.f20987a = i15;
                    }

                    @Override // e5.j
                    public final void invoke(Object obj2) {
                        long longValue;
                        switch (this.f20987a) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                a0 a0Var = (a0) ((c) obj2);
                                a0Var.getClass();
                                b bVar = this.f20988b;
                                r5.w wVar32 = bVar.f20966d;
                                if (wVar32 != null) {
                                    String c10 = a0Var.f20938b.c(bVar.f20964b, wVar32);
                                    HashMap hashMap = a0Var.f20944h;
                                    Long l10 = (Long) hashMap.get(c10);
                                    HashMap hashMap2 = a0Var.f20943g;
                                    Long l11 = (Long) hashMap2.get(c10);
                                    long j122 = 0;
                                    if (l10 == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l10.longValue();
                                    }
                                    hashMap.put(c10, Long.valueOf(longValue + this.f20990d));
                                    if (l11 != null) {
                                        j122 = l11.longValue();
                                    }
                                    hashMap2.put(c10, Long.valueOf(j122 + this.f20989c));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
