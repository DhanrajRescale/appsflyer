package dg;

import com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListFragment;

/* loaded from: classes.dex */
public final class g implements tu.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WalletTransactionListFragment f14356a;

    public g(WalletTransactionListFragment walletTransactionListFragment) {
        this.f14356a = walletTransactionListFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // tu.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(g7.c3 r12, yt.a r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof dg.f
            if (r0 == 0) goto L13
            r0 = r13
            dg.f r0 = (dg.f) r0
            int r1 = r0.f14355e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14355e = r1
            goto L18
        L13:
            dg.f r0 = new dg.f
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f14353c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f14355e
            r3 = 0
            r4 = 2
            r5 = 1
            java.lang.String r6 = "transactionsAdapter"
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            ut.n.b(r13)
            goto Lad
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            g7.c3 r12 = r0.f14352b
            dg.g r2 = r0.f14351a
            ut.n.b(r13)
            goto L9a
        L3e:
            ut.n.b(r13)
            com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListFragment r13 = r11.f14356a
            m4.m r2 = r13.q()
            ba.cq r2 = (ba.cq) r2
            androidx.constraintlayout.widget.Group r2 = r2.f4406u
            java.lang.String r7 = "errorTransactionGroup"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            zq.f.M(r2)
            m4.m r2 = r13.q()
            ba.cq r2 = (ba.cq) r2
            androidx.recyclerview.widget.RecyclerView r2 = r2.f4411z
            java.lang.String r7 = "walletTransactionRecyclerView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            zq.f.m0(r2)
            dg.p r2 = r13.f9727g
            if (r2 == 0) goto Lb8
            java.util.ArrayList r7 = r2.f14378h
            r7.clear()
            java.util.ArrayList r2 = r2.f14379i
            r2.clear()
            dg.p r13 = r13.f9727g
            if (r13 == 0) goto Lb4
            g7.c3 r2 = new g7.c3
            g7.i1 r7 = new g7.i1
            vt.i0 r8 = vt.i0.f38321a
            r7.<init>(r8)
            tu.j r8 = new tu.j
            r8.<init>(r7)
            kq.e r7 = g7.c3.f16691e
            mt.p r9 = g7.c3.f16692f
            g7.e r10 = g7.e.f16718d
            r2.<init>(r8, r7, r9, r10)
            r0.f14351a = r11
            r0.f14352b = r12
            r0.f14355e = r5
            java.lang.Object r13 = r13.s(r2, r0)
            if (r13 != r1) goto L99
            return r1
        L99:
            r2 = r11
        L9a:
            com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListFragment r13 = r2.f14356a
            dg.p r13 = r13.f9727g
            if (r13 == 0) goto Lb0
            r0.f14351a = r3
            r0.f14352b = r3
            r0.f14355e = r4
            java.lang.Object r12 = r13.s(r12, r0)
            if (r12 != r1) goto Lad
            return r1
        Lad:
            kotlin.Unit r12 = kotlin.Unit.f23355a
            return r12
        Lb0:
            kotlin.jvm.internal.Intrinsics.k(r6)
            throw r3
        Lb4:
            kotlin.jvm.internal.Intrinsics.k(r6)
            throw r3
        Lb8:
            kotlin.jvm.internal.Intrinsics.k(r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dg.g.a(g7.c3, yt.a):java.lang.Object");
    }
}
