package d4;

import android.view.View;

/* loaded from: classes.dex */
public final class r0 extends t0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13810e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i10, int i11, int i12, int i13) {
        super(i10, CharSequence.class, i11, i12);
        this.f13810e = i13;
    }

    @Override // d4.t0
    public final Object c(View view) {
        int i10 = this.f13810e;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(g1.d(view));
                    default:
                        return Boolean.valueOf(g1.c(view));
                }
            case 1:
                switch (i10) {
                    case 1:
                        return g1.b(view);
                    default:
                        return i1.b(view);
                }
            case 2:
                switch (i10) {
                    case 1:
                        return g1.b(view);
                    default:
                        return i1.b(view);
                }
            default:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(g1.d(view));
                    default:
                        return Boolean.valueOf(g1.c(view));
                }
        }
    }

    @Override // d4.t0
    public final void d(View view, Object obj) {
        int i10 = this.f13810e;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case 0:
                        g1.j(view, bool.booleanValue());
                        return;
                    default:
                        g1.g(view, bool.booleanValue());
                        return;
                }
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                switch (i10) {
                    case 1:
                        g1.h(view, charSequence);
                        return;
                    default:
                        i1.e(view, charSequence);
                        return;
                }
            case 2:
                CharSequence charSequence2 = (CharSequence) obj;
                switch (i10) {
                    case 1:
                        g1.h(view, charSequence2);
                        return;
                    default:
                        i1.e(view, charSequence2);
                        return;
                }
            default:
                Boolean bool2 = (Boolean) obj;
                switch (i10) {
                    case 0:
                        g1.j(view, bool2.booleanValue());
                        return;
                    default:
                        g1.g(view, bool2.booleanValue());
                        return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r4 == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r4 == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0087, code lost:
    
        if (r4 == r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a3, code lost:
    
        if (r4 == r5) goto L57;
     */
    @Override // d4.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            int r2 = r3.f13810e
            switch(r2) {
                case 0: goto L6a;
                case 1: goto L57;
                case 2: goto L44;
                default: goto L7;
            }
        L7:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            switch(r2) {
                case 0: goto L2a;
                default: goto Le;
            }
        Le:
            if (r4 == 0) goto L18
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L18
            r4 = r1
            goto L19
        L18:
            r4 = r0
        L19:
            if (r5 == 0) goto L23
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L23
            r5 = r1
            goto L24
        L23:
            r5 = r0
        L24:
            if (r4 != r5) goto L27
        L26:
            r0 = r1
        L27:
            r4 = r0 ^ 1
            goto L43
        L2a:
            if (r4 == 0) goto L34
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L34
            r4 = r1
            goto L35
        L34:
            r4 = r0
        L35:
            if (r5 == 0) goto L3f
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L3f
            r5 = r1
            goto L40
        L3f:
            r5 = r0
        L40:
            if (r4 != r5) goto L27
            goto L26
        L43:
            return r4
        L44:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            switch(r2) {
                case 1: goto L51;
                default: goto L4b;
            }
        L4b:
            boolean r4 = android.text.TextUtils.equals(r4, r5)
        L4f:
            r4 = r4 ^ r1
            goto L56
        L51:
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            goto L4f
        L56:
            return r4
        L57:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            switch(r2) {
                case 1: goto L64;
                default: goto L5e;
            }
        L5e:
            boolean r4 = android.text.TextUtils.equals(r4, r5)
        L62:
            r4 = r4 ^ r1
            goto L69
        L64:
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            goto L62
        L69:
            return r4
        L6a:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            switch(r2) {
                case 0: goto L8d;
                default: goto L71;
            }
        L71:
            if (r4 == 0) goto L7b
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L7b
            r4 = r1
            goto L7c
        L7b:
            r4 = r0
        L7c:
            if (r5 == 0) goto L86
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L86
            r5 = r1
            goto L87
        L86:
            r5 = r0
        L87:
            if (r4 != r5) goto L8a
        L89:
            r0 = r1
        L8a:
            r4 = r0 ^ 1
            goto La6
        L8d:
            if (r4 == 0) goto L97
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L97
            r4 = r1
            goto L98
        L97:
            r4 = r0
        L98:
            if (r5 == 0) goto La2
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto La2
            r5 = r1
            goto La3
        La2:
            r5 = r0
        La3:
            if (r4 != r5) goto L8a
            goto L89
        La6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.r0.h(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(int i10, int i11) {
        super(i10, Boolean.class, 0, 28);
        this.f13810e = i11;
    }
}
