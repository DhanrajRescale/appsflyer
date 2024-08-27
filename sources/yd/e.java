package yd;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.ch;
import ba.n8;
import com.assetgro.stockgro.data.model.ExitOption;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lyd/e;", "Landroidx/fragment/app/t;", "<init>", "()V", "sb/b", "yd/c", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends androidx.fragment.app.t {

    /* renamed from: b, reason: collision with root package name */
    public static c f41535b;

    /* renamed from: d, reason: collision with root package name */
    public static ExitOption f41537d;

    /* renamed from: a, reason: collision with root package name */
    public ch f41539a;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f41536c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static String f41538e = "nil";

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        int i10 = ch.f4369w;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        ch chVar = (ch) m4.m.g(from, R.layout.fragment_exit_chat_dialog, viewGroup, false, null);
        Intrinsics.checkNotNullExpressionValue(chVar, "inflate(...)");
        Intrinsics.checkNotNullParameter(chVar, "<set-?>");
        this.f41539a = chVar;
        View view = q().f27491e;
        Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -2);
        }
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) new ColorDrawable(0), 48);
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawable(insetDrawable);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i10;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ch q10 = q();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("KEY_TITLE");
        } else {
            str = null;
        }
        q10.f4370s.setText(str);
        ArrayList arrayList = f41536c;
        arrayList.add(new ExitOption("OTHERS", HttpUrl.FRAGMENT_ENCODE_SET));
        Iterator it = arrayList.iterator();
        while (true) {
            final int i11 = 0;
            if (it.hasNext()) {
                ExitOption exitOption = (ExitOption) it.next();
                LayoutInflater from = LayoutInflater.from(getContext());
                ch q11 = q();
                int i12 = n8.f5528w;
                DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
                n8 n8Var = (n8) m4.m.g(from, R.layout.cell_exit_chat_options, q11.f4371t, false, null);
                Intrinsics.checkNotNullExpressionValue(n8Var, "inflate(...)");
                n8Var.f5531u.setText(exitOption.getMsg());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                View view2 = n8Var.f27491e;
                view2.setLayoutParams(layoutParams);
                int i13 = 8;
                if (Intrinsics.a(exitOption.getCode(), "OTHERS")) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                n8Var.f5531u.setVisibility(i10);
                if (Intrinsics.a(exitOption.getCode(), "OTHERS")) {
                    i13 = 0;
                }
                EditText exitReasonEditable = n8Var.f5532v;
                exitReasonEditable.setVisibility(i13);
                String code = exitOption.getCode();
                CheckBox checkBox = n8Var.f5529s;
                checkBox.setTag(code);
                checkBox.setOnCheckedChangeListener(new a(i11, exitOption, n8Var, this));
                Intrinsics.checkNotNullExpressionValue(exitReasonEditable, "exitReasonEditable");
                exitReasonEditable.addTextChangedListener(new i9.a(0, d.f41528b));
                n8Var.f5530t.setOnClickListener(new jd.a(n8Var, 6));
                q().f4371t.addView(view2);
            } else {
                q().f4373v.setOnClickListener(new View.OnClickListener(this) { // from class: yd.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f41527b;

                    {
                        this.f41527b = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
                    
                        if (r4.length() > 0) goto L24;
                     */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void onClick(android.view.View r18) {
                        /*
                            r17 = this;
                            r0 = r17
                            int r1 = r2
                            java.lang.String r2 = "listener"
                            yd.e r3 = r0.f41527b
                            java.lang.String r4 = "this$0"
                            r5 = 0
                            switch(r1) {
                                case 0: goto L22;
                                default: goto Le;
                            }
                        Le:
                            yd.c r1 = yd.e.f41535b
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
                            yd.c r1 = yd.e.f41535b
                            if (r1 == 0) goto L1e
                            r1.e()
                            r3.dismiss()
                            return
                        L1e:
                            kotlin.jvm.internal.Intrinsics.k(r2)
                            throw r5
                        L22:
                            yd.c r1 = yd.e.f41535b
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
                            com.assetgro.stockgro.data.model.ExitOption r1 = yd.e.f41537d
                            java.lang.String r7 = "null cannot be cast to non-null type android.view.LayoutInflater"
                            java.lang.String r8 = "layout_inflater"
                            java.lang.String r9 = ""
                            java.lang.String r10 = "text"
                            java.lang.String r11 = "context"
                            java.lang.String r12 = "getString(...)"
                            java.lang.String r13 = "requireContext(...)"
                            r14 = 1
                            if (r1 == 0) goto Lad
                            r3.getClass()
                            java.lang.String r15 = r1.getCode()
                            java.lang.String r4 = "OTHERS"
                            boolean r4 = kotlin.jvm.internal.Intrinsics.a(r15, r4)
                            if (r4 == 0) goto L9a
                            java.lang.String r4 = r1.getMsg()
                            if (r4 == 0) goto L9a
                            int r15 = r4.length()
                            if (r15 != 0) goto L94
                            android.content.Context r15 = r3.requireContext()
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r13)
                            r5 = 2132018618(0x7f1405ba, float:1.9675548E38)
                            java.lang.String r5 = r3.getString(r5)
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r12)
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r11)
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r10)
                            int r16 = r5.length()
                            if (r16 != 0) goto L73
                            goto L94
                        L73:
                            android.widget.Toast r6 = android.widget.Toast.makeText(r15, r9, r14)
                            java.lang.Object r15 = r15.getSystemService(r8)
                            kotlin.jvm.internal.Intrinsics.d(r15, r7)
                            android.view.LayoutInflater r15 = (android.view.LayoutInflater) r15
                            r0 = 2131558520(0x7f0d0078, float:1.8742358E38)
                            r14 = 0
                            android.view.View r15 = r15.inflate(r0, r14)
                            r0 = 2131363394(0x7f0a0642, float:1.8346596E38)
                            android.view.View r14 = r15.findViewById(r0)
                            android.widget.TextView r14 = (android.widget.TextView) r14
                            w.k.c(r5, r14, r6, r15)
                        L94:
                            int r0 = r4.length()
                            if (r0 <= 0) goto La4
                        L9a:
                            yd.c r0 = yd.e.f41535b
                            if (r0 == 0) goto La8
                            r0.d(r1)
                            r3.dismiss()
                        La4:
                            kotlin.Unit r0 = kotlin.Unit.f23355a
                            r14 = r0
                            goto Lae
                        La8:
                            kotlin.jvm.internal.Intrinsics.k(r2)
                            r0 = 0
                            throw r0
                        Lad:
                            r14 = 0
                        Lae:
                            if (r14 != 0) goto Lf0
                            android.content.Context r0 = r3.requireContext()
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r13)
                            r1 = 2132018810(0x7f14067a, float:1.9675937E38)
                            java.lang.String r1 = r3.getString(r1)
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r12)
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r11)
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r10)
                            int r2 = r1.length()
                            if (r2 != 0) goto Lce
                            goto Lf0
                        Lce:
                            r2 = 1
                            android.widget.Toast r2 = android.widget.Toast.makeText(r0, r9, r2)
                            java.lang.Object r0 = r0.getSystemService(r8)
                            kotlin.jvm.internal.Intrinsics.d(r0, r7)
                            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                            r3 = 0
                            r4 = 2131558520(0x7f0d0078, float:1.8742358E38)
                            android.view.View r0 = r0.inflate(r4, r3)
                            r3 = 2131363394(0x7f0a0642, float:1.8346596E38)
                            android.view.View r3 = r0.findViewById(r3)
                            android.widget.TextView r3 = (android.widget.TextView) r3
                            w.k.c(r1, r3, r2, r0)
                        Lf0:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: yd.b.onClick(android.view.View):void");
                    }
                });
                final int i14 = 1;
                q().f4372u.setOnClickListener(new View.OnClickListener(this) { // from class: yd.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f41527b;

                    {
                        this.f41527b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            */
                        /*
                            this = this;
                            r0 = r17
                            int r1 = r2
                            java.lang.String r2 = "listener"
                            yd.e r3 = r0.f41527b
                            java.lang.String r4 = "this$0"
                            r5 = 0
                            switch(r1) {
                                case 0: goto L22;
                                default: goto Le;
                            }
                        Le:
                            yd.c r1 = yd.e.f41535b
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
                            yd.c r1 = yd.e.f41535b
                            if (r1 == 0) goto L1e
                            r1.e()
                            r3.dismiss()
                            return
                        L1e:
                            kotlin.jvm.internal.Intrinsics.k(r2)
                            throw r5
                        L22:
                            yd.c r1 = yd.e.f41535b
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
                            com.assetgro.stockgro.data.model.ExitOption r1 = yd.e.f41537d
                            java.lang.String r7 = "null cannot be cast to non-null type android.view.LayoutInflater"
                            java.lang.String r8 = "layout_inflater"
                            java.lang.String r9 = ""
                            java.lang.String r10 = "text"
                            java.lang.String r11 = "context"
                            java.lang.String r12 = "getString(...)"
                            java.lang.String r13 = "requireContext(...)"
                            r14 = 1
                            if (r1 == 0) goto Lad
                            r3.getClass()
                            java.lang.String r15 = r1.getCode()
                            java.lang.String r4 = "OTHERS"
                            boolean r4 = kotlin.jvm.internal.Intrinsics.a(r15, r4)
                            if (r4 == 0) goto L9a
                            java.lang.String r4 = r1.getMsg()
                            if (r4 == 0) goto L9a
                            int r15 = r4.length()
                            if (r15 != 0) goto L94
                            android.content.Context r15 = r3.requireContext()
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r13)
                            r5 = 2132018618(0x7f1405ba, float:1.9675548E38)
                            java.lang.String r5 = r3.getString(r5)
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r12)
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r11)
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r10)
                            int r16 = r5.length()
                            if (r16 != 0) goto L73
                            goto L94
                        L73:
                            android.widget.Toast r6 = android.widget.Toast.makeText(r15, r9, r14)
                            java.lang.Object r15 = r15.getSystemService(r8)
                            kotlin.jvm.internal.Intrinsics.d(r15, r7)
                            android.view.LayoutInflater r15 = (android.view.LayoutInflater) r15
                            r0 = 2131558520(0x7f0d0078, float:1.8742358E38)
                            r14 = 0
                            android.view.View r15 = r15.inflate(r0, r14)
                            r0 = 2131363394(0x7f0a0642, float:1.8346596E38)
                            android.view.View r14 = r15.findViewById(r0)
                            android.widget.TextView r14 = (android.widget.TextView) r14
                            w.k.c(r5, r14, r6, r15)
                        L94:
                            int r0 = r4.length()
                            if (r0 <= 0) goto La4
                        L9a:
                            yd.c r0 = yd.e.f41535b
                            if (r0 == 0) goto La8
                            r0.d(r1)
                            r3.dismiss()
                        La4:
                            kotlin.Unit r0 = kotlin.Unit.f23355a
                            r14 = r0
                            goto Lae
                        La8:
                            kotlin.jvm.internal.Intrinsics.k(r2)
                            r0 = 0
                            throw r0
                        Lad:
                            r14 = 0
                        Lae:
                            if (r14 != 0) goto Lf0
                            android.content.Context r0 = r3.requireContext()
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r13)
                            r1 = 2132018810(0x7f14067a, float:1.9675937E38)
                            java.lang.String r1 = r3.getString(r1)
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r12)
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r11)
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r10)
                            int r2 = r1.length()
                            if (r2 != 0) goto Lce
                            goto Lf0
                        Lce:
                            r2 = 1
                            android.widget.Toast r2 = android.widget.Toast.makeText(r0, r9, r2)
                            java.lang.Object r0 = r0.getSystemService(r8)
                            kotlin.jvm.internal.Intrinsics.d(r0, r7)
                            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                            r3 = 0
                            r4 = 2131558520(0x7f0d0078, float:1.8742358E38)
                            android.view.View r0 = r0.inflate(r4, r3)
                            r3 = 2131363394(0x7f0a0642, float:1.8346596E38)
                            android.view.View r3 = r0.findViewById(r3)
                            android.widget.TextView r3 = (android.widget.TextView) r3
                            w.k.c(r1, r3, r2, r0)
                        Lf0:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: yd.b.onClick(android.view.View):void");
                    }
                });
                return;
            }
        }
    }

    public final ch q() {
        ch chVar = this.f41539a;
        if (chVar != null) {
            return chVar;
        }
        Intrinsics.k("binding");
        throw null;
    }
}
