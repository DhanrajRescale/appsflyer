package k5;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22143c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22145e;

    public /* synthetic */ k(Object obj, String str, long j10, long j11, int i10) {
        this.f22141a = i10;
        this.f22145e = obj;
        this.f22142b = str;
        this.f22143c = j10;
        this.f22144d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f22141a;
        Object obj = this.f22145e;
        switch (i10) {
            case 0:
                final String str = this.f22142b;
                final long j10 = this.f22143c;
                final long j11 = this.f22144d;
                i5.d0 d0Var = (i5.d0) ((tr.e) obj).f36362c;
                int i11 = e5.x.f15050a;
                j5.w wVar = (j5.w) d0Var.f19384a.f19472r;
                final j5.b U = wVar.U();
                final int i12 = 1;
                wVar.V(U, 1008, new e5.j(U, str, j11, j10, i12) { // from class: j5.g

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f20979a;

                    {
                        this.f20979a = i12;
                    }

                    @Override // e5.j
                    public final void invoke(Object obj2) {
                        switch (this.f20979a) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                ((c) obj2).getClass();
                                return;
                        }
                    }
                });
                return;
            default:
                final String str2 = this.f22142b;
                final long j12 = this.f22143c;
                final long j13 = this.f22144d;
                x5.w wVar2 = (x5.w) ((x5.e) obj).f39981b;
                int i13 = e5.x.f15050a;
                j5.w wVar3 = (j5.w) ((i5.d0) wVar2).f19384a.f19472r;
                final j5.b U2 = wVar3.U();
                final int i14 = 0;
                wVar3.V(U2, 1016, new e5.j(U2, str2, j13, j12, i14) { // from class: j5.g

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f20979a;

                    {
                        this.f20979a = i14;
                    }

                    @Override // e5.j
                    public final void invoke(Object obj2) {
                        switch (this.f20979a) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                ((c) obj2).getClass();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
