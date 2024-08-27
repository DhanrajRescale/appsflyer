package m;

import android.text.TextWatcher;
import com.linkedin.android.spyglass.ui.MentionsEditText;

/* loaded from: classes.dex */
public final class v2 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25757b;

    public /* synthetic */ v2(Object obj, int i10) {
        this.f25756a = i10;
        this.f25757b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void afterTextChanged(android.text.Editable r12) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.v2.afterTextChanged(android.text.Editable):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004a  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void beforeTextChanged(java.lang.CharSequence r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.f25756a
            java.lang.String r1 = "s"
            java.lang.Object r2 = r11.f25757b
            switch(r0) {
                case 0: goto Lb9;
                case 1: goto Lb9;
                case 2: goto Laf;
                case 3: goto Lab;
                case 4: goto Laa;
                case 5: goto Laa;
                case 6: goto Laa;
                case 7: goto Laa;
                case 8: goto Laa;
                case 9: goto Laa;
                default: goto L9;
            }
        L9:
            com.linkedin.android.spyglass.ui.MentionsEditText r2 = (com.linkedin.android.spyglass.ui.MentionsEditText) r2
            boolean r0 = r2.f12079g
            if (r0 == 0) goto L11
            goto Laa
        L11:
            int r0 = r2.getSelectionStart()
            xr.d r1 = r2.getMentionsText()
            int r3 = r1.length()
            r4 = 0
            java.lang.Class<xr.a> r5 = xr.a.class
            java.lang.Object[] r3 = r1.getSpans(r4, r3, r5)
            xr.a[] r3 = (xr.a[]) r3
            r6 = 0
            if (r3 == 0) goto L39
            int r7 = r3.length
            r8 = r4
        L2b:
            if (r8 >= r7) goto L39
            r9 = r3[r8]
            int r10 = r1.getSpanEnd(r9)
            if (r10 != r0) goto L36
            goto L3a
        L36:
            int r8 = r8 + 1
            goto L2b
        L39:
            r9 = r6
        L3a:
            int r0 = r15 + 1
            if (r14 == r0) goto L40
            if (r15 != 0) goto L4b
        L40:
            if (r9 == 0) goto L4b
            boolean r0 = r9.f40547b
            if (r0 != 0) goto L4a
            r0 = 1
            r9.f40547b = r0
            goto L94
        L4a:
            throw r6
        L4b:
            int r0 = r2.getSelectionStart()
            r1 = r0
        L50:
            if (r1 <= 0) goto L67
            cs.b r3 = r2.f12073a
            if (r3 == 0) goto L67
            int r6 = r1 + (-1)
            char r6 = r12.charAt(r6)
            ek.h0 r3 = (ek.h0) r3
            boolean r3 = r3.o(r6)
            if (r3 != 0) goto L67
            int r1 = r1 + (-1)
            goto L50
        L67:
            android.text.Editable r3 = r2.getText()
            java.lang.Object[] r0 = r3.getSpans(r1, r0, r5)
            xr.a[] r0 = (xr.a[]) r0
            int r1 = r0.length
            r5 = r4
        L73:
            if (r5 >= r1) goto L94
            r6 = r0[r5]
            int r7 = r6.f40548c
            r8 = 3
            if (r7 == r8) goto L91
            int r7 = r3.getSpanStart(r6)
            int r8 = r3.getSpanEnd(r6)
            ds.e r9 = new ds.e
            r9.<init>(r6, r8)
            r10 = 34
            r3.setSpan(r9, r7, r8, r10)
            r3.removeSpan(r6)
        L91:
            int r5 = r5 + 1
            goto L73
        L94:
            java.util.ArrayList r0 = r2.f12077e
            int r1 = r0.size()
        L9a:
            if (r4 >= r1) goto Laa
            java.lang.Object r2 = r0.get(r4)
            android.text.TextWatcher r2 = (android.text.TextWatcher) r2
            if (r2 == r11) goto La7
            r2.beforeTextChanged(r12, r13, r14, r15)
        La7:
            int r4 = r4 + 1
            goto L9a
        Laa:
            return
        Lab:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            return
        Laf:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment r2 = (com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment) r2
            android.widget.PopupWindow r12 = com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment.f9146w
            r2.O()
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.v2.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTextChanged(java.lang.CharSequence r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.v2.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(MentionsEditText mentionsEditText) {
        this(mentionsEditText, 10);
        this.f25756a = 10;
    }
}
