package a8;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import k7.n1;

/* loaded from: classes.dex */
public final class c extends n1 {

    /* renamed from: a, reason: collision with root package name */
    public i f254a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f255b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f256c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f257d;

    /* renamed from: e, reason: collision with root package name */
    public int f258e;

    /* renamed from: f, reason: collision with root package name */
    public int f259f;

    /* renamed from: g, reason: collision with root package name */
    public final y6.c f260g;

    /* renamed from: h, reason: collision with root package name */
    public int f261h;

    /* renamed from: i, reason: collision with root package name */
    public int f262i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f263j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f264k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f265l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f266m;

    /* JADX WARN: Type inference failed for: r1v4, types: [y6.c, java.lang.Object] */
    public c(ViewPager2 viewPager2) {
        this.f255b = viewPager2;
        m mVar = viewPager2.f2518j;
        this.f256c = mVar;
        this.f257d = (LinearLayoutManager) mVar.getLayoutManager();
        this.f260g = new Object();
        d();
    }

    @Override // k7.n1
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        i iVar;
        i iVar2;
        int i11 = this.f258e;
        boolean z11 = true;
        if ((i11 != 1 || this.f259f != 1) && i10 == 1) {
            this.f266m = false;
            this.f258e = 1;
            int i12 = this.f262i;
            if (i12 != -1) {
                this.f261h = i12;
                this.f262i = -1;
            } else if (this.f261h == -1) {
                this.f261h = this.f257d.Q0();
            }
            c(1);
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && i10 == 2) {
            if (this.f264k) {
                c(2);
                this.f263j = true;
                return;
            }
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z11 = false;
        }
        y6.c cVar = this.f260g;
        if (z11 && i10 == 0) {
            e();
            if (!this.f264k) {
                int i13 = cVar.f41233a;
                if (i13 != -1 && (iVar2 = this.f254a) != null) {
                    iVar2.b(i13, s0.g.f34069a, 0);
                }
            } else if (cVar.f41235c == 0) {
                int i14 = this.f261h;
                int i15 = cVar.f41233a;
                if (i14 != i15 && (iVar = this.f254a) != null) {
                    iVar.c(i15);
                }
            }
            c(0);
            d();
        }
        if (this.f258e == 2 && i10 == 0 && this.f265l) {
            e();
            if (cVar.f41235c == 0) {
                int i16 = this.f262i;
                int i17 = cVar.f41233a;
                if (i16 != i17) {
                    if (i17 == -1) {
                        i17 = 0;
                    }
                    i iVar3 = this.f254a;
                    if (iVar3 != null) {
                        iVar3.c(i17);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 == r8) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // k7.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f264k = r6
            r5.e()
            boolean r0 = r5.f263j
            y6.c r1 = r5.f260g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L40
            r5.f263j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f255b
            a8.h r8 = r8.f2515g
            int r8 = r8.C()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r1.f41235c
            if (r7 == 0) goto L30
            int r7 = r1.f41233a
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r1.f41233a
        L32:
            r5.f262i = r7
            int r8 = r5.f261h
            if (r8 == r7) goto L50
            a8.i r8 = r5.f254a
            if (r8 == 0) goto L50
            r8.c(r7)
            goto L50
        L40:
            int r7 = r5.f258e
            if (r7 != 0) goto L50
            int r7 = r1.f41233a
            if (r7 != r2) goto L49
            r7 = r3
        L49:
            a8.i r8 = r5.f254a
            if (r8 == 0) goto L50
            r8.c(r7)
        L50:
            int r7 = r1.f41233a
            if (r7 != r2) goto L55
            r7 = r3
        L55:
            float r8 = r1.f41234b
            int r0 = r1.f41235c
            a8.i r4 = r5.f254a
            if (r4 == 0) goto L60
            r4.b(r7, r8, r0)
        L60:
            int r7 = r1.f41233a
            int r8 = r5.f262i
            if (r7 == r8) goto L68
            if (r8 != r2) goto L76
        L68:
            int r7 = r1.f41235c
            if (r7 != 0) goto L76
            int r7 = r5.f259f
            if (r7 == r6) goto L76
            r5.c(r3)
            r5.d()
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.c.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i10) {
        if ((this.f258e == 3 && this.f259f == 0) || this.f259f == i10) {
            return;
        }
        this.f259f = i10;
        i iVar = this.f254a;
        if (iVar != null) {
            iVar.a(i10);
        }
    }

    public final void d() {
        this.f258e = 0;
        this.f259f = 0;
        y6.c cVar = this.f260g;
        cVar.f41233a = -1;
        cVar.f41234b = s0.g.f34069a;
        cVar.f41235c = 0;
        this.f261h = -1;
        this.f262i = -1;
        this.f263j = false;
        this.f264k = false;
        this.f266m = false;
        this.f265l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
    
        r1 = r0.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013c, code lost:
    
        if (r3 >= r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0146, code lost:
    
        if (a8.a.a(r0.u(r3)) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0148, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0152, code lost:
    
        throw new java.lang.IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016a, code lost:
    
        throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "Page can only be offset by a positive amount, not by %d", java.lang.Integer.valueOf(r2.f41235c)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012f, code lost:
    
        if (r7[r4 - 1][1] >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0136, code lost:
    
        if (r0.v() <= 1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.c.e():void");
    }
}
