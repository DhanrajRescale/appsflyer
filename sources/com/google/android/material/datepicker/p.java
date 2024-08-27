package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.internal.CheckableImageButton;
import d4.b1;
import d4.e2;
import d4.f2;
import d4.n1;
import d4.y0;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class p<S> extends androidx.fragment.app.t {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f11304a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f11305b;

    /* renamed from: c, reason: collision with root package name */
    public int f11306c;

    /* renamed from: d, reason: collision with root package name */
    public w f11307d;

    /* renamed from: e, reason: collision with root package name */
    public d f11308e;

    /* renamed from: f, reason: collision with root package name */
    public l f11309f;

    /* renamed from: g, reason: collision with root package name */
    public int f11310g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f11311h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11312i;

    /* renamed from: j, reason: collision with root package name */
    public int f11313j;

    /* renamed from: k, reason: collision with root package name */
    public int f11314k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f11315l;

    /* renamed from: m, reason: collision with root package name */
    public int f11316m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f11317n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f11318o;

    /* renamed from: p, reason: collision with root package name */
    public CheckableImageButton f11319p;

    /* renamed from: q, reason: collision with root package name */
    public to.h f11320q;

    /* renamed from: r, reason: collision with root package name */
    public Button f11321r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11322s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f11323t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f11324u;

    public p() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f11304a = new LinkedHashSet();
        this.f11305b = new LinkedHashSet();
    }

    public static int r(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar c10 = y.c();
        c10.set(5, 1);
        Calendar b10 = y.b(c10);
        b10.get(2);
        b10.get(1);
        int maximum = b10.getMaximum(7);
        b10.getActualMaximum(5);
        b10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean s(int i10, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(pn.e.w(context, R.attr.materialCalendarStyle, l.class.getCanonicalName()).data, new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    @Override // androidx.fragment.app.t, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f11304a.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f11306c = bundle.getInt("OVERRIDE_THEME_RES_ID");
        com.google.android.gms.internal.p002firebaseauthapi.a.q(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f11308e = (d) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        com.google.android.gms.internal.p002firebaseauthapi.a.q(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f11310g = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f11311h = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f11313j = bundle.getInt("INPUT_MODE_KEY");
        this.f11314k = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f11315l = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f11316m = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f11317n = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f11311h;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f11310g);
        }
        this.f11323t = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f11324u = charSequence;
    }

    @Override // androidx.fragment.app.t
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i10 = this.f11306c;
        if (i10 != 0) {
            Dialog dialog = new Dialog(requireContext, i10);
            Context context = dialog.getContext();
            this.f11312i = s(android.R.attr.windowFullscreen, context);
            int i11 = pn.e.w(context, R.attr.colorSurface, p.class.getCanonicalName()).data;
            to.h hVar = new to.h(context, null, R.attr.materialCalendarStyle, 2132083919);
            this.f11320q = hVar;
            hVar.k(context);
            this.f11320q.n(ColorStateList.valueOf(i11));
            to.h hVar2 = this.f11320q;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = n1.f13788a;
            hVar2.m(b1.i(decorView));
            return dialog;
        }
        q();
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        String string;
        if (this.f11312i) {
            i10 = R.layout.mtrl_picker_fullscreen;
        } else {
            i10 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        if (this.f11312i) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(r(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(r(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = n1.f13788a;
        boolean z10 = true;
        y0.f(textView, 1);
        this.f11319p = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f11318o = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f11319p.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f11319p;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, iu.j.m(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], iu.j.m(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f11319p;
        if (this.f11313j == 0) {
            z10 = false;
        }
        checkableImageButton2.setChecked(z10);
        n1.n(this.f11319p, null);
        CheckableImageButton checkableImageButton3 = this.f11319p;
        if (checkableImageButton3.isChecked()) {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f11319p.setContentDescription(string);
        this.f11319p.setOnClickListener(new n(this));
        this.f11321r = (Button) inflate.findViewById(R.id.confirm_button);
        q();
        throw null;
    }

    @Override // androidx.fragment.app.t, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f11305b.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.datepicker.b, java.lang.Object] */
    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onSaveInstanceState(Bundle bundle) {
        r rVar;
        r b10;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f11306c);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        d dVar = this.f11308e;
        ?? obj = new Object();
        int i10 = b.f11264b;
        int i11 = b.f11264b;
        long j10 = dVar.f11266a.f11332f;
        long j11 = dVar.f11267b.f11332f;
        obj.f11265a = Long.valueOf(dVar.f11269d.f11332f);
        int i12 = dVar.f11270e;
        l lVar = this.f11309f;
        if (lVar == null) {
            rVar = null;
        } else {
            rVar = lVar.f11290d;
        }
        if (rVar != null) {
            obj.f11265a = Long.valueOf(rVar.f11332f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar.f11268c);
        r b11 = r.b(j10);
        r b12 = r.b(j11);
        c cVar = (c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = obj.f11265a;
        if (l10 == null) {
            b10 = null;
        } else {
            b10 = r.b(l10.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new d(b11, b12, cVar, b10, i12));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f11310g);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f11311h);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f11314k);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f11315l);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f11316m);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f11317n);
    }

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onStart() {
        w wVar;
        CharSequence charSequence;
        Integer num;
        boolean z10;
        int i10;
        boolean z11;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f11312i) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f11320q);
            if (!this.f11322s) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                if (findViewById.getBackground() instanceof ColorDrawable) {
                    num = Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor());
                } else {
                    num = null;
                }
                int i11 = Build.VERSION.SDK_INT;
                boolean z12 = false;
                if (num != null && num.intValue() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                int i12 = pn.e.i(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z10) {
                    num = Integer.valueOf(i12);
                }
                Integer valueOf = Integer.valueOf(i12);
                if (i11 >= 30) {
                    f2.a(window, false);
                } else {
                    e2.a(window, false);
                }
                window.getContext();
                Context context = window.getContext();
                if (i11 < 27) {
                    i10 = u3.a.d(pn.e.i(context, android.R.attr.navigationBarColor, -16777216), 128);
                } else {
                    i10 = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i10);
                boolean n10 = pn.e.n(num.intValue());
                if (!pn.e.n(0) && !n10) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                ((ni.j) new t9.c(window, window.getDecorView()).f35633b).q(z11);
                boolean n11 = pn.e.n(valueOf.intValue());
                if (pn.e.n(i10) || (i10 == 0 && n11)) {
                    z12 = true;
                }
                ((ni.j) new t9.c(window, window.getDecorView()).f35633b).p(z12);
                o oVar = new o(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = n1.f13788a;
                b1.u(findViewById, oVar);
                this.f11322s = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f11320q, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new go.a(requireDialog(), rect));
        }
        requireContext();
        int i13 = this.f11306c;
        if (i13 != 0) {
            q();
            d dVar = this.f11308e;
            l lVar = new l();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i13);
            bundle.putParcelable("GRID_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", dVar);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putParcelable("CURRENT_MONTH_KEY", dVar.f11269d);
            lVar.setArguments(bundle);
            this.f11309f = lVar;
            boolean isChecked = this.f11319p.isChecked();
            if (isChecked) {
                q();
                d dVar2 = this.f11308e;
                wVar = new q();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i13);
                bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", dVar2);
                wVar.setArguments(bundle2);
            } else {
                wVar = this.f11309f;
            }
            this.f11307d = wVar;
            TextView textView = this.f11318o;
            if (isChecked && getResources().getConfiguration().orientation == 2) {
                charSequence = this.f11324u;
            } else {
                charSequence = this.f11323t;
            }
            textView.setText(charSequence);
            q();
            getContext();
            throw null;
        }
        q();
        throw null;
    }

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onStop() {
        this.f11307d.f11346a.clear();
        super.onStop();
    }

    public final void q() {
        com.google.android.gms.internal.p002firebaseauthapi.a.q(getArguments().getParcelable("DATE_SELECTOR_KEY"));
    }
}
