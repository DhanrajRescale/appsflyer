package r5;

import b5.g1;
import b5.h1;
import b5.i1;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d extends l {

    /* renamed from: c, reason: collision with root package name */
    public final long f33116c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33117d;

    /* renamed from: e, reason: collision with root package name */
    public final long f33118e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33119f;

    public d(i1 i1Var, long j10, long j11) {
        super(i1Var);
        long max;
        long j12;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        final int i10 = 1;
        if (i1Var.i() == 1) {
            h1 n10 = i1Var.n(0, new h1(), 0L);
            long max2 = Math.max(0L, j10);
            if (!n10.f3343l && max2 != 0 && !n10.f3339h) {
                throw new IOException(i10) { // from class: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        /*
                            r1 = this;
                            if (r2 == 0) goto L11
                            r0 = 1
                            if (r2 == r0) goto Le
                            r0 = 2
                            if (r2 == r0) goto Lb
                            java.lang.String r2 = "unknown"
                            goto L13
                        Lb:
                            java.lang.String r2 = "start exceeds end"
                            goto L13
                        Le:
                            java.lang.String r2 = "not seekable to start"
                            goto L13
                        L11:
                            java.lang.String r2 = "invalid period count"
                        L13:
                            java.lang.String r0 = "Illegal clipping: "
                            java.lang.String r2 = r0.concat(r2)
                            r1.<init>(r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException.<init>(int):void");
                    }
                };
            }
            if (j11 == Long.MIN_VALUE) {
                max = n10.f3345n;
            } else {
                max = Math.max(0L, j11);
            }
            long j13 = n10.f3345n;
            if (j13 != -9223372036854775807L) {
                max = max > j13 ? j13 : max;
                if (max2 > max) {
                    final int i11 = 2;
                    throw new IOException
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0055: THROW 
                          (wrap:java.io.IOException:0x0052: CONSTRUCTOR (r9v5 'i11' int A[DONT_INLINE]) A[MD:(int):void (m), WRAPPED] (LINE:83) call: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException.<init>(int):void type: CONSTRUCTOR)
                         (LINE:86) in method: r5.d.<init>(b5.i1, long, long):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.setCodeVar(jadx.core.dex.instructions.args.CodeVar)" because the return value of "jadx.core.dex.instructions.args.RegisterArg.getSVar()" is null
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:810)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:388)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 41 more
                        */
                    /*
                        this = this;
                        r7.<init>(r8)
                        int r0 = r8.i()
                        r1 = 0
                        r2 = 1
                        if (r0 != r2) goto L76
                        b5.h1 r0 = new b5.h1
                        r0.<init>()
                        r3 = 0
                        b5.h1 r8 = r8.n(r1, r0, r3)
                        long r9 = java.lang.Math.max(r3, r9)
                        boolean r0 = r8.f3343l
                        if (r0 != 0) goto L2d
                        int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                        if (r0 == 0) goto L2d
                        boolean r0 = r8.f3339h
                        if (r0 == 0) goto L27
                        goto L2d
                    L27:
                        androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException r8 = new androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                        r8.<init>(r2)
                        throw r8
                    L2d:
                        r5 = -9223372036854775808
                        int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                        if (r0 != 0) goto L36
                        long r11 = r8.f3345n
                        goto L3a
                    L36:
                        long r11 = java.lang.Math.max(r3, r11)
                    L3a:
                        long r3 = r8.f3345n
                        r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                        int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                        if (r0 == 0) goto L56
                        int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                        if (r0 <= 0) goto L4a
                        r11 = r3
                    L4a:
                        int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                        if (r0 > 0) goto L4f
                        goto L56
                    L4f:
                        androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException r8 = new androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                        r9 = 2
                        r8.<init>(r9)
                        throw r8
                    L56:
                        r7.f33116c = r9
                        r7.f33117d = r11
                        int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                        if (r0 != 0) goto L60
                        r9 = r5
                        goto L62
                    L60:
                        long r9 = r11 - r9
                    L62:
                        r7.f33118e = r9
                        boolean r8 = r8.f3340i
                        if (r8 == 0) goto L73
                        if (r0 == 0) goto L72
                        int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                        if (r8 == 0) goto L73
                        int r8 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                        if (r8 != 0) goto L73
                    L72:
                        r1 = r2
                    L73:
                        r7.f33119f = r1
                        return
                    L76:
                        androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException r8 = new androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                        r8.<init>(r1)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: r5.d.<init>(b5.i1, long, long):void");
                }

                @Override // r5.l, b5.i1
                public final g1 g(int i10, g1 g1Var, boolean z10) {
                    long j10;
                    this.f33206b.g(0, g1Var, z10);
                    long j11 = g1Var.f3320e - this.f33116c;
                    long j12 = this.f33118e;
                    if (j12 == -9223372036854775807L) {
                        j10 = -9223372036854775807L;
                    } else {
                        j10 = j12 - j11;
                    }
                    g1Var.j(g1Var.f3316a, g1Var.f3317b, 0, j10, j11, b5.b.f3203g, false);
                    return g1Var;
                }

                @Override // r5.l, b5.i1
                public final h1 n(int i10, h1 h1Var, long j10) {
                    this.f33206b.n(0, h1Var, 0L);
                    long j11 = h1Var.f3348q;
                    long j12 = this.f33116c;
                    h1Var.f3348q = j11 + j12;
                    h1Var.f3345n = this.f33118e;
                    h1Var.f3340i = this.f33119f;
                    long j13 = h1Var.f3344m;
                    if (j13 != -9223372036854775807L) {
                        long max = Math.max(j13, j12);
                        h1Var.f3344m = max;
                        long j14 = this.f33117d;
                        if (j14 != -9223372036854775807L) {
                            max = Math.min(max, j14);
                        }
                        h1Var.f3344m = max - j12;
                    }
                    long P = e5.x.P(j12);
                    long j15 = h1Var.f3336e;
                    if (j15 != -9223372036854775807L) {
                        h1Var.f3336e = j15 + P;
                    }
                    long j16 = h1Var.f3337f;
                    if (j16 != -9223372036854775807L) {
                        h1Var.f3337f = j16 + P;
                    }
                    return h1Var;
                }
            }
