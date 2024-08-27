package d7;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.a1;
import b5.g1;
import b5.h1;
import b5.i1;
import b5.n1;
import b5.o1;
import b5.u0;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import i5.b1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import k7.z0;
import lp.j1;

/* loaded from: classes.dex */
public final class x extends FrameLayout {
    public static final float[] O0;
    public final View A;
    public boolean A0;
    public final View B;
    public boolean B0;
    public final TextView C;
    public boolean C0;
    public final TextView D;
    public boolean D0;
    public final o0 E;
    public boolean E0;
    public final StringBuilder F;
    public int F0;
    public final Formatter G;
    public int G0;
    public final g1 H;
    public int H0;
    public final h1 I;
    public long[] I0;
    public final androidx.activity.b J;
    public boolean[] J0;
    public final long[] K0;
    public final boolean[] L0;
    public long M0;
    public boolean N0;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f14130a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f14131b;

    /* renamed from: c, reason: collision with root package name */
    public final l f14132c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f14133d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f14134e;

    /* renamed from: e0, reason: collision with root package name */
    public final Drawable f14135e0;

    /* renamed from: f, reason: collision with root package name */
    public final r f14136f;

    /* renamed from: f0, reason: collision with root package name */
    public final Drawable f14137f0;

    /* renamed from: g, reason: collision with root package name */
    public final o f14138g;

    /* renamed from: g0, reason: collision with root package name */
    public final Drawable f14139g0;

    /* renamed from: h, reason: collision with root package name */
    public final k f14140h;

    /* renamed from: h0, reason: collision with root package name */
    public final String f14141h0;

    /* renamed from: i, reason: collision with root package name */
    public final k f14142i;

    /* renamed from: i0, reason: collision with root package name */
    public final String f14143i0;

    /* renamed from: j, reason: collision with root package name */
    public final g f14144j;

    /* renamed from: j0, reason: collision with root package name */
    public final String f14145j0;

    /* renamed from: k, reason: collision with root package name */
    public final PopupWindow f14146k;

    /* renamed from: k0, reason: collision with root package name */
    public final Drawable f14147k0;

    /* renamed from: l, reason: collision with root package name */
    public final int f14148l;

    /* renamed from: l0, reason: collision with root package name */
    public final Drawable f14149l0;

    /* renamed from: m, reason: collision with root package name */
    public final View f14150m;

    /* renamed from: m0, reason: collision with root package name */
    public final float f14151m0;

    /* renamed from: n, reason: collision with root package name */
    public final View f14152n;
    public final float n0;

    /* renamed from: o, reason: collision with root package name */
    public final View f14153o;

    /* renamed from: o0, reason: collision with root package name */
    public final String f14154o0;

    /* renamed from: p, reason: collision with root package name */
    public final View f14155p;

    /* renamed from: p0, reason: collision with root package name */
    public final String f14156p0;

    /* renamed from: q, reason: collision with root package name */
    public final View f14157q;

    /* renamed from: q0, reason: collision with root package name */
    public final Drawable f14158q0;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f14159r;

    /* renamed from: r0, reason: collision with root package name */
    public final Drawable f14160r0;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f14161s;

    /* renamed from: s0, reason: collision with root package name */
    public final String f14162s0;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f14163t;

    /* renamed from: t0, reason: collision with root package name */
    public final String f14164t0;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f14165u;

    /* renamed from: u0, reason: collision with root package name */
    public final Drawable f14166u0;

    /* renamed from: v, reason: collision with root package name */
    public final View f14167v;

    /* renamed from: v0, reason: collision with root package name */
    public final Drawable f14168v0;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f14169w;

    /* renamed from: w0, reason: collision with root package name */
    public final String f14170w0;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f14171x;

    /* renamed from: x0, reason: collision with root package name */
    public final String f14172x0;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f14173y;

    /* renamed from: y0, reason: collision with root package name */
    public a1 f14174y0;

    /* renamed from: z, reason: collision with root package name */
    public final View f14175z;

    /* renamed from: z0, reason: collision with root package name */
    public m f14176z0;

    static {
        b5.l0.a("media3.ui");
        O0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public x(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        TextView textView;
        TextView textView2;
        ImageView imageView;
        this.F0 = 5000;
        this.H0 = 0;
        this.G0 = 200;
        int i10 = R.layout.exo_player_control_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h0.f14046c, 0, 0);
            try {
                i10 = obtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                this.F0 = obtainStyledAttributes.getInt(21, this.F0);
                this.H0 = obtainStyledAttributes.getInt(9, this.H0);
                z11 = obtainStyledAttributes.getBoolean(18, true);
                z12 = obtainStyledAttributes.getBoolean(15, true);
                z13 = obtainStyledAttributes.getBoolean(17, true);
                z14 = obtainStyledAttributes.getBoolean(16, true);
                z17 = obtainStyledAttributes.getBoolean(19, false);
                z15 = obtainStyledAttributes.getBoolean(20, false);
                z16 = obtainStyledAttributes.getBoolean(22, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(23, this.G0));
                z10 = obtainStyledAttributes.getBoolean(2, true);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
            z15 = false;
            z16 = false;
            z17 = false;
        }
        LayoutInflater.from(context).inflate(i10, this);
        setDescendantFocusability(262144);
        l lVar = new l(this);
        this.f14132c = lVar;
        this.f14133d = new CopyOnWriteArrayList();
        this.H = new g1();
        this.I = new h1();
        StringBuilder sb2 = new StringBuilder();
        this.F = sb2;
        this.G = new Formatter(sb2, Locale.getDefault());
        this.I0 = new long[0];
        this.J0 = new boolean[0];
        this.K0 = new long[0];
        this.L0 = new boolean[0];
        this.J = new androidx.activity.b(this, 21);
        this.C = (TextView) findViewById(R.id.exo_duration);
        this.D = (TextView) findViewById(R.id.exo_position);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_subtitle);
        this.f14169w = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(lVar);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f14171x = imageView3;
        final int i11 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: d7.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f14043b;

            {
                this.f14043b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                x.a(this.f14043b);
            }
        };
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(onClickListener);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f14173y = imageView4;
        final int i12 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: d7.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f14043b;

            {
                this.f14043b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i12;
                x.a(this.f14043b);
            }
        };
        if (imageView4 != null) {
            imageView4.setVisibility(8);
            imageView4.setOnClickListener(onClickListener2);
        }
        View findViewById = findViewById(R.id.exo_settings);
        this.f14175z = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(lVar);
        }
        View findViewById2 = findViewById(R.id.exo_playback_speed);
        this.A = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(lVar);
        }
        View findViewById3 = findViewById(R.id.exo_audio_track);
        this.B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(lVar);
        }
        o0 o0Var = (o0) findViewById(R.id.exo_progress);
        View findViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (o0Var != null) {
            this.E = o0Var;
        } else if (findViewById4 != null) {
            f fVar = new f(context, attributeSet);
            fVar.setId(R.id.exo_progress);
            fVar.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(fVar, indexOfChild);
            this.E = fVar;
        } else {
            this.E = null;
        }
        o0 o0Var2 = this.E;
        if (o0Var2 != null) {
            ((f) o0Var2).f14038x.add(lVar);
        }
        View findViewById5 = findViewById(R.id.exo_play_pause);
        this.f14153o = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(lVar);
        }
        View findViewById6 = findViewById(R.id.exo_prev);
        this.f14150m = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(lVar);
        }
        View findViewById7 = findViewById(R.id.exo_next);
        this.f14152n = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(lVar);
        }
        Typeface a10 = t3.p.a(R.font.roboto_medium_numbers, context);
        View findViewById8 = findViewById(R.id.exo_rew);
        boolean z18 = z16;
        if (findViewById8 == null) {
            textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        } else {
            textView = null;
        }
        this.f14161s = textView;
        if (textView != null) {
            textView.setTypeface(a10);
        }
        findViewById8 = findViewById8 == null ? textView : findViewById8;
        this.f14157q = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(lVar);
        }
        View findViewById9 = findViewById(R.id.exo_ffwd);
        boolean z19 = z15;
        if (findViewById9 == null) {
            textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        } else {
            textView2 = null;
        }
        this.f14159r = textView2;
        if (textView2 != null) {
            textView2.setTypeface(a10);
        }
        findViewById9 = findViewById9 == null ? textView2 : findViewById9;
        this.f14155p = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(lVar);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f14163t = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(lVar);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f14165u = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(lVar);
        }
        Resources resources = context.getResources();
        this.f14131b = resources;
        this.f14151m0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.n0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View findViewById10 = findViewById(R.id.exo_vr);
        this.f14167v = findViewById10;
        if (findViewById10 != null) {
            k(findViewById10, false);
        }
        d0 d0Var = new d0(this);
        this.f14130a = d0Var;
        d0Var.C = z10;
        boolean z20 = z17;
        r rVar = new r(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{e5.x.o(context, resources, R.drawable.exo_styled_controls_speed), e5.x.o(context, resources, R.drawable.exo_styled_controls_audiotrack)});
        this.f14136f = rVar;
        this.f14148l = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f14134e = recyclerView;
        recyclerView.setAdapter(rVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f14146k = popupWindow;
        if (e5.x.f15050a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(lVar);
        this.N0 = true;
        this.f14144j = new g(getResources());
        this.f14158q0 = e5.x.o(context, resources, R.drawable.exo_styled_controls_subtitle_on);
        this.f14160r0 = e5.x.o(context, resources, R.drawable.exo_styled_controls_subtitle_off);
        this.f14162s0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f14164t0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        int i13 = 0;
        this.f14140h = new k(this, 1, i13);
        this.f14142i = new k(this, i13, i13);
        this.f14138g = new o(this, resources.getStringArray(R.array.exo_controls_playback_speeds), O0);
        this.f14166u0 = e5.x.o(context, resources, R.drawable.exo_styled_controls_fullscreen_exit);
        this.f14168v0 = e5.x.o(context, resources, R.drawable.exo_styled_controls_fullscreen_enter);
        this.f14135e0 = e5.x.o(context, resources, R.drawable.exo_styled_controls_repeat_off);
        this.f14137f0 = e5.x.o(context, resources, R.drawable.exo_styled_controls_repeat_one);
        this.f14139g0 = e5.x.o(context, resources, R.drawable.exo_styled_controls_repeat_all);
        this.f14147k0 = e5.x.o(context, resources, R.drawable.exo_styled_controls_shuffle_on);
        this.f14149l0 = e5.x.o(context, resources, R.drawable.exo_styled_controls_shuffle_off);
        this.f14170w0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f14172x0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f14141h0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f14143i0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f14145j0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f14154o0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f14156p0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        boolean z21 = true;
        d0Var.i((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        d0Var.i(findViewById9, z12);
        d0Var.i(findViewById8, z11);
        d0Var.i(findViewById6, z13);
        d0Var.i(findViewById7, z14);
        d0Var.i(imageView6, z20);
        d0Var.i(imageView2, z19);
        d0Var.i(findViewById10, z18);
        if (this.H0 != 0) {
            imageView = imageView5;
        } else {
            imageView = imageView5;
            z21 = false;
        }
        d0Var.i(imageView, z21);
        addOnLayoutChangeListener(new i(this, 0));
    }

    public static void a(x xVar) {
        if (xVar.f14176z0 != null) {
            boolean z10 = !xVar.A0;
            xVar.A0 = z10;
            String str = xVar.f14172x0;
            Drawable drawable = xVar.f14168v0;
            String str2 = xVar.f14170w0;
            Drawable drawable2 = xVar.f14166u0;
            ImageView imageView = xVar.f14171x;
            if (imageView != null) {
                if (z10) {
                    imageView.setImageDrawable(drawable2);
                    imageView.setContentDescription(str2);
                } else {
                    imageView.setImageDrawable(drawable);
                    imageView.setContentDescription(str);
                }
            }
            boolean z11 = xVar.A0;
            ImageView imageView2 = xVar.f14173y;
            if (imageView2 != null) {
                if (z11) {
                    imageView2.setImageDrawable(drawable2);
                    imageView2.setContentDescription(str2);
                } else {
                    imageView2.setImageDrawable(drawable);
                    imageView2.setContentDescription(str);
                }
            }
            m mVar = xVar.f14176z0;
            if (mVar != null) {
                ((e0) mVar).f14008c.getClass();
            }
        }
    }

    public static boolean c(a1 a1Var, h1 h1Var) {
        i1 w10;
        int p10;
        b5.i iVar = (b5.i) a1Var;
        if (!iVar.b(17) || (p10 = (w10 = ((i5.g0) iVar).w()).p()) <= 1 || p10 > 100) {
            return false;
        }
        for (int i10 = 0; i10 < p10; i10++) {
            if (w10.n(i10, h1Var, 0L).f3345n == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        a1 a1Var = this.f14174y0;
        if (a1Var != null && ((b5.i) a1Var).b(13)) {
            i5.g0 g0Var = (i5.g0) this.f14174y0;
            g0Var.X();
            g0Var.O(new u0(f10, g0Var.f19459g0.f19375n.f3618b));
        }
    }

    public final boolean d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a1 a1Var = this.f14174y0;
        if (a1Var == null || (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (((i5.g0) a1Var).B() != 4) {
                    b5.i iVar = (b5.i) a1Var;
                    if (iVar.b(12)) {
                        i5.g0 g0Var = (i5.g0) iVar;
                        g0Var.X();
                        iVar.j(12, g0Var.f19476v);
                    }
                }
            } else {
                if (keyCode == 89) {
                    b5.i iVar2 = (b5.i) a1Var;
                    if (iVar2.b(11)) {
                        i5.g0 g0Var2 = (i5.g0) iVar2;
                        g0Var2.X();
                        iVar2.j(11, -g0Var2.f19475u);
                    }
                }
                if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 && keyCode != 85) {
                        if (keyCode != 87) {
                            if (keyCode != 88) {
                                if (keyCode != 126) {
                                    if (keyCode == 127) {
                                        int i10 = e5.x.f15050a;
                                        b5.i iVar3 = (b5.i) a1Var;
                                        if (iVar3.b(1)) {
                                            ((i5.g0) iVar3).N(false);
                                        }
                                    }
                                } else {
                                    e5.x.A(a1Var);
                                }
                            } else {
                                b5.i iVar4 = (b5.i) a1Var;
                                if (iVar4.b(7)) {
                                    iVar4.k();
                                }
                            }
                        } else {
                            b5.i iVar5 = (b5.i) a1Var;
                            if (iVar5.b(9)) {
                                iVar5.i();
                            }
                        }
                    } else {
                        int i11 = e5.x.f15050a;
                        i5.g0 g0Var3 = (i5.g0) a1Var;
                        if (g0Var3.A() && g0Var3.B() != 1 && g0Var3.B() != 4) {
                            b5.i iVar6 = (b5.i) a1Var;
                            if (iVar6.b(1)) {
                                ((i5.g0) iVar6).N(false);
                            }
                        } else {
                            e5.x.A(a1Var);
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!d(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void e(z0 z0Var, View view) {
        this.f14134e.setAdapter(z0Var);
        q();
        this.N0 = false;
        PopupWindow popupWindow = this.f14146k;
        popupWindow.dismiss();
        this.N0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i10 = this.f14148l;
        popupWindow.showAsDropDown(view, width - i10, (-popupWindow.getHeight()) - i10);
    }

    public final j1 f(o1 o1Var, int i10) {
        kp.j.A(4, "initialCapacity");
        Object[] objArr = new Object[4];
        lp.o0 o0Var = o1Var.f3562a;
        int i11 = 0;
        for (int i12 = 0; i12 < o0Var.size(); i12++) {
            n1 n1Var = (n1) o0Var.get(i12);
            if (n1Var.f3552b.f3378c == i10) {
                for (int i13 = 0; i13 < n1Var.f3551a; i13++) {
                    if (n1Var.d(i13)) {
                        b5.v vVar = n1Var.f3552b.f3379d[i13];
                        if ((vVar.f3644d & 2) == 0) {
                            t tVar = new t(o1Var, i12, i13, this.f14144j.c(vVar));
                            int i14 = i11 + 1;
                            if (objArr.length < i14) {
                                objArr = Arrays.copyOf(objArr, bl.j.z(objArr.length, i14));
                            }
                            objArr[i11] = tVar;
                            i11 = i14;
                        }
                    }
                }
            }
        }
        return lp.o0.o(i11, objArr);
    }

    public final void g() {
        d0 d0Var = this.f14130a;
        int i10 = d0Var.f14003z;
        if (i10 != 3 && i10 != 2) {
            d0Var.g();
            if (!d0Var.C) {
                d0Var.j(2);
            } else if (d0Var.f14003z == 1) {
                d0Var.f13990m.start();
            } else {
                d0Var.f13991n.start();
            }
        }
    }

    public a1 getPlayer() {
        return this.f14174y0;
    }

    public int getRepeatToggleModes() {
        return this.H0;
    }

    public boolean getShowShuffleButton() {
        return this.f14130a.c(this.f14165u);
    }

    public boolean getShowSubtitleButton() {
        return this.f14130a.c(this.f14169w);
    }

    public int getShowTimeoutMs() {
        return this.F0;
    }

    public boolean getShowVrButton() {
        return this.f14130a.c(this.f14167v);
    }

    public final boolean h() {
        d0 d0Var = this.f14130a;
        if (d0Var.f14003z == 0 && d0Var.f13978a.i()) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void j() {
        m();
        l();
        p();
        r();
        t();
        n();
        s();
    }

    public final void k(View view, boolean z10) {
        float f10;
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        if (z10) {
            f10 = this.f14151m0;
        } else {
            f10 = this.n0;
        }
        view.setAlpha(f10);
    }

    public final void l() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j10;
        long j11;
        if (i() && this.B0) {
            a1 a1Var = this.f14174y0;
            if (a1Var != null) {
                if (this.C0 && c(a1Var, this.I)) {
                    z10 = ((b5.i) a1Var).b(10);
                } else {
                    z10 = ((b5.i) a1Var).b(5);
                }
                b5.i iVar = (b5.i) a1Var;
                z12 = iVar.b(7);
                z13 = iVar.b(11);
                z14 = iVar.b(12);
                z11 = iVar.b(9);
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            Resources resources = this.f14131b;
            View view = this.f14157q;
            if (z13) {
                a1 a1Var2 = this.f14174y0;
                if (a1Var2 != null) {
                    i5.g0 g0Var = (i5.g0) a1Var2;
                    g0Var.X();
                    j11 = g0Var.f19475u;
                } else {
                    j11 = 5000;
                }
                int i10 = (int) (j11 / 1000);
                TextView textView = this.f14161s;
                if (textView != null) {
                    textView.setText(String.valueOf(i10));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i10, Integer.valueOf(i10)));
                }
            }
            View view2 = this.f14155p;
            if (z14) {
                a1 a1Var3 = this.f14174y0;
                if (a1Var3 != null) {
                    i5.g0 g0Var2 = (i5.g0) a1Var3;
                    g0Var2.X();
                    j10 = g0Var2.f19476v;
                } else {
                    j10 = 15000;
                }
                int i11 = (int) (j10 / 1000);
                TextView textView2 = this.f14159r;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i11));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i11, Integer.valueOf(i11)));
                }
            }
            k(this.f14150m, z12);
            k(view, z13);
            k(view2, z14);
            k(this.f14152n, z11);
            o0 o0Var = this.E;
            if (o0Var != null) {
                ((f) o0Var).setEnabled(z10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r8 = this;
            boolean r0 = r8.i()
            if (r0 == 0) goto L84
            boolean r0 = r8.B0
            if (r0 != 0) goto Lc
            goto L84
        Lc:
            android.view.View r0 = r8.f14153o
            if (r0 == 0) goto L84
            b5.a1 r1 = r8.f14174y0
            int r2 = e5.x.f15050a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            i5.g0 r1 = (i5.g0) r1
            boolean r4 = r1.A()
            if (r4 == 0) goto L30
            int r4 = r1.B()
            if (r4 == r3) goto L30
            int r1 = r1.B()
            r4 = 4
            if (r1 != r4) goto L2e
            goto L30
        L2e:
            r1 = r2
            goto L31
        L30:
            r1 = r3
        L31:
            if (r1 == 0) goto L37
            r4 = 2131231152(0x7f0801b0, float:1.8078377E38)
            goto L3a
        L37:
            r4 = 2131231151(0x7f0801af, float:1.8078375E38)
        L3a:
            if (r1 == 0) goto L40
            r1 = 2132017513(0x7f140169, float:1.9673307E38)
            goto L43
        L40:
            r1 = 2132017512(0x7f140168, float:1.9673305E38)
        L43:
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.content.Context r6 = r8.getContext()
            android.content.res.Resources r7 = r8.f14131b
            android.graphics.drawable.Drawable r4 = e5.x.o(r6, r7, r4)
            r5.setImageDrawable(r4)
            java.lang.String r1 = r7.getString(r1)
            r0.setContentDescription(r1)
            b5.a1 r1 = r8.f14174y0
            if (r1 == 0) goto L81
            b5.i r1 = (b5.i) r1
            boolean r1 = r1.b(r3)
            if (r1 == 0) goto L81
            b5.a1 r1 = r8.f14174y0
            r4 = 17
            b5.i r1 = (b5.i) r1
            boolean r1 = r1.b(r4)
            if (r1 == 0) goto L80
            b5.a1 r1 = r8.f14174y0
            i5.g0 r1 = (i5.g0) r1
            b5.i1 r1 = r1.w()
            boolean r1 = r1.q()
            if (r1 != 0) goto L81
        L80:
            r2 = r3
        L81:
            r8.k(r0, r2)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.x.m():void");
    }

    public final void n() {
        o oVar;
        a1 a1Var = this.f14174y0;
        if (a1Var == null) {
            return;
        }
        i5.g0 g0Var = (i5.g0) a1Var;
        g0Var.X();
        float f10 = g0Var.f19459g0.f19375n.f3617a;
        boolean z10 = false;
        float f11 = Float.MAX_VALUE;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            oVar = this.f14138g;
            float[] fArr = oVar.f14096e;
            if (i10 >= fArr.length) {
                break;
            }
            float abs = Math.abs(f10 - fArr[i10]);
            if (abs < f11) {
                i11 = i10;
                f11 = abs;
            }
            i10++;
        }
        oVar.f14097f = i11;
        String str = oVar.f14095d[i11];
        r rVar = this.f14136f;
        rVar.f14107e[0] = str;
        if (rVar.p(1) || rVar.p(0)) {
            z10 = true;
        }
        k(this.f14175z, z10);
    }

    public final void o() {
        long j10;
        int B;
        long j11;
        long P;
        if (i() && this.B0) {
            a1 a1Var = this.f14174y0;
            long j12 = 0;
            if (a1Var != null && ((b5.i) a1Var).b(16)) {
                long j13 = this.M0;
                i5.g0 g0Var = (i5.g0) a1Var;
                g0Var.X();
                long p10 = g0Var.p(g0Var.f19459g0) + j13;
                long j14 = this.M0;
                g0Var.X();
                if (g0Var.f19459g0.f19362a.q()) {
                    P = g0Var.f19463i0;
                } else {
                    b1 b1Var = g0Var.f19459g0;
                    if (b1Var.f19372k.f3559d != b1Var.f19363b.f3559d) {
                        P = e5.x.P(b1Var.f19362a.n(g0Var.s(), g0Var.f3349a, 0L).f3345n);
                    } else {
                        long j15 = b1Var.f19377p;
                        if (g0Var.f19459g0.f19372k.a()) {
                            b1 b1Var2 = g0Var.f19459g0;
                            g1 h10 = b1Var2.f19362a.h(b1Var2.f19372k.f3556a, g0Var.f19468n);
                            long d10 = h10.d(g0Var.f19459g0.f19372k.f3557b);
                            if (d10 == Long.MIN_VALUE) {
                                j15 = h10.f3319d;
                            } else {
                                j15 = d10;
                            }
                        }
                        b1 b1Var3 = g0Var.f19459g0;
                        i1 i1Var = b1Var3.f19362a;
                        Object obj = b1Var3.f19372k.f3556a;
                        g1 g1Var = g0Var.f19468n;
                        i1Var.h(obj, g1Var);
                        P = e5.x.P(j15 + g1Var.f3320e);
                    }
                }
                j10 = P + j14;
                j12 = p10;
            } else {
                j10 = 0;
            }
            TextView textView = this.D;
            if (textView != null && !this.E0) {
                textView.setText(e5.x.w(this.F, this.G, j12));
            }
            o0 o0Var = this.E;
            if (o0Var != null) {
                ((f) o0Var).setPosition(j12);
                ((f) this.E).setBufferedPosition(j10);
            }
            removeCallbacks(this.J);
            if (a1Var == null) {
                B = 1;
            } else {
                B = ((i5.g0) a1Var).B();
            }
            long j16 = 1000;
            if (a1Var != null && ((b5.i) a1Var).f()) {
                o0 o0Var2 = this.E;
                if (o0Var2 != null) {
                    j11 = ((f) o0Var2).getPreferredUpdateDelay();
                } else {
                    j11 = 1000;
                }
                long min = Math.min(j11, 1000 - (j12 % 1000));
                i5.g0 g0Var2 = (i5.g0) a1Var;
                g0Var2.X();
                float f10 = g0Var2.f19459g0.f19375n.f3617a;
                if (f10 > s0.g.f34069a) {
                    j16 = ((float) min) / f10;
                }
                postDelayed(this.J, e5.x.j(j16, this.G0, 1000L));
                return;
            }
            if (B != 4 && B != 1) {
                postDelayed(this.J, 1000L);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d0 d0Var = this.f14130a;
        d0Var.f13978a.addOnLayoutChangeListener(d0Var.f14001x);
        this.B0 = true;
        if (h()) {
            d0Var.h();
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d0 d0Var = this.f14130a;
        d0Var.f13978a.removeOnLayoutChangeListener(d0Var.f14001x);
        this.B0 = false;
        removeCallbacks(this.J);
        d0Var.g();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f14130a.f13979b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public final void p() {
        ImageView imageView;
        if (i() && this.B0 && (imageView = this.f14163t) != null) {
            if (this.H0 == 0) {
                k(imageView, false);
                return;
            }
            a1 a1Var = this.f14174y0;
            String str = this.f14141h0;
            Drawable drawable = this.f14135e0;
            if (a1Var != null && ((b5.i) a1Var).b(15)) {
                k(imageView, true);
                i5.g0 g0Var = (i5.g0) a1Var;
                g0Var.X();
                int i10 = g0Var.E;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            imageView.setImageDrawable(this.f14139g0);
                            imageView.setContentDescription(this.f14145j0);
                            return;
                        }
                        return;
                    }
                    imageView.setImageDrawable(this.f14137f0);
                    imageView.setContentDescription(this.f14143i0);
                    return;
                }
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            k(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void q() {
        RecyclerView recyclerView = this.f14134e;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i10 = this.f14148l;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i10 * 2));
        PopupWindow popupWindow = this.f14146k;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i10 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void r() {
        ImageView imageView;
        if (i() && this.B0 && (imageView = this.f14165u) != null) {
            a1 a1Var = this.f14174y0;
            if (!this.f14130a.c(imageView)) {
                k(imageView, false);
                return;
            }
            String str = this.f14156p0;
            Drawable drawable = this.f14149l0;
            if (a1Var != null && ((b5.i) a1Var).b(14)) {
                k(imageView, true);
                i5.g0 g0Var = (i5.g0) a1Var;
                g0Var.X();
                if (g0Var.F) {
                    drawable = this.f14147k0;
                }
                imageView.setImageDrawable(drawable);
                g0Var.X();
                if (g0Var.F) {
                    str = this.f14154o0;
                }
                imageView.setContentDescription(str);
                return;
            }
            k(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void s() {
        boolean z10;
        i1 i1Var;
        boolean z11;
        long j10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        g1 g1Var;
        boolean z12;
        int length;
        a1 a1Var = this.f14174y0;
        if (a1Var == null) {
            return;
        }
        boolean z13 = this.C0;
        boolean z14 = false;
        boolean z15 = true;
        h1 h1Var = this.I;
        if (z13 && c(a1Var, h1Var)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D0 = z10;
        this.M0 = 0L;
        b5.i iVar = (b5.i) a1Var;
        if (iVar.b(17)) {
            i1Var = ((i5.g0) a1Var).w();
        } else {
            i1Var = i1.f3357a;
        }
        long j11 = -9223372036854775807L;
        if (!i1Var.q()) {
            int s7 = ((i5.g0) a1Var).s();
            boolean z16 = this.D0;
            if (z16) {
                i11 = 0;
            } else {
                i11 = s7;
            }
            if (z16) {
                i12 = i1Var.p() - 1;
            } else {
                i12 = s7;
            }
            i10 = 0;
            long j12 = 0;
            while (true) {
                if (i11 > i12) {
                    break;
                }
                if (i11 == s7) {
                    this.M0 = e5.x.P(j12);
                }
                i1Var.o(i11, h1Var);
                if (h1Var.f3345n == j11) {
                    yk.j.H0(this.D0 ^ z15);
                    break;
                }
                int i16 = h1Var.f3346o;
                while (i16 <= h1Var.f3347p) {
                    g1 g1Var2 = this.H;
                    i1Var.g(i16, g1Var2, z14);
                    b5.b bVar = g1Var2.f3322g;
                    int i17 = bVar.f3214e;
                    while (i17 < bVar.f3211b) {
                        long d10 = g1Var2.d(i17);
                        if (d10 == Long.MIN_VALUE) {
                            i13 = s7;
                            i14 = i12;
                            long j13 = g1Var2.f3319d;
                            if (j13 == j11) {
                                i15 = i13;
                                g1Var = g1Var2;
                                i17++;
                                i12 = i14;
                                s7 = i15;
                                g1Var2 = g1Var;
                                j11 = -9223372036854775807L;
                            } else {
                                d10 = j13;
                            }
                        } else {
                            i13 = s7;
                            i14 = i12;
                        }
                        long j14 = d10 + g1Var2.f3320e;
                        if (j14 >= 0) {
                            long[] jArr = this.I0;
                            if (i10 == jArr.length) {
                                if (jArr.length == 0) {
                                    length = 1;
                                } else {
                                    length = jArr.length * 2;
                                }
                                this.I0 = Arrays.copyOf(jArr, length);
                                this.J0 = Arrays.copyOf(this.J0, length);
                            }
                            this.I0[i10] = e5.x.P(j12 + j14);
                            boolean[] zArr = this.J0;
                            b5.a a10 = g1Var2.f3322g.a(i17);
                            int i18 = a10.f3195b;
                            if (i18 == -1) {
                                i15 = i13;
                                g1Var = g1Var2;
                                z12 = true;
                            } else {
                                int i19 = 0;
                                while (i19 < i18) {
                                    i15 = i13;
                                    int i20 = a10.f3198e[i19];
                                    g1Var = g1Var2;
                                    if (i20 != 0 && i20 != 1) {
                                        i19++;
                                        i13 = i15;
                                        g1Var2 = g1Var;
                                    } else {
                                        z12 = true;
                                        break;
                                    }
                                }
                                i15 = i13;
                                g1Var = g1Var2;
                                z12 = false;
                            }
                            zArr[i10] = !z12;
                            i10++;
                        } else {
                            i15 = i13;
                            g1Var = g1Var2;
                        }
                        i17++;
                        i12 = i14;
                        s7 = i15;
                        g1Var2 = g1Var;
                        j11 = -9223372036854775807L;
                    }
                    i16++;
                    z15 = true;
                    z14 = false;
                    j11 = -9223372036854775807L;
                }
                j12 += h1Var.f3345n;
                i11++;
                i12 = i12;
                s7 = s7;
                z14 = false;
                j11 = -9223372036854775807L;
            }
            z11 = z15;
            j10 = j12;
        } else {
            z11 = true;
            if (iVar.b(16)) {
                long a11 = iVar.a();
                if (a11 != -9223372036854775807L) {
                    j10 = e5.x.F(a11);
                    i10 = 0;
                }
            }
            j10 = 0;
            i10 = 0;
        }
        long P = e5.x.P(j10);
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(e5.x.w(this.F, this.G, P));
        }
        o0 o0Var = this.E;
        if (o0Var != null) {
            f fVar = (f) o0Var;
            fVar.setDuration(P);
            long[] jArr2 = this.K0;
            int length2 = jArr2.length;
            int i21 = i10 + length2;
            long[] jArr3 = this.I0;
            if (i21 > jArr3.length) {
                this.I0 = Arrays.copyOf(jArr3, i21);
                this.J0 = Arrays.copyOf(this.J0, i21);
            }
            boolean z17 = false;
            System.arraycopy(jArr2, 0, this.I0, i10, length2);
            System.arraycopy(this.L0, 0, this.J0, i10, length2);
            long[] jArr4 = this.I0;
            boolean[] zArr2 = this.J0;
            if (i21 == 0 || (jArr4 != null && zArr2 != null)) {
                z17 = z11;
            }
            yk.j.E0(z17);
            fVar.f14019g0 = i21;
            fVar.f14021h0 = jArr4;
            fVar.f14023i0 = zArr2;
            fVar.e();
        }
        o();
    }

    public void setAnimationEnabled(boolean z10) {
        this.f14130a.C = z10;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(m mVar) {
        boolean z10;
        this.f14176z0 = mVar;
        boolean z11 = true;
        if (mVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView = this.f14171x;
        if (imageView != null) {
            if (z10) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (mVar == null) {
            z11 = false;
        }
        ImageView imageView2 = this.f14173y;
        if (imageView2 != null) {
            if (z11) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (((i5.g0) r5).f19473s == android.os.Looper.getMainLooper()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPlayer(b5.a1 r5) {
        /*
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            r0 = r3
            goto Lf
        Le:
            r0 = r2
        Lf:
            yk.j.H0(r0)
            if (r5 == 0) goto L1f
            r0 = r5
            i5.g0 r0 = (i5.g0) r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = r0.f19473s
            if (r0 != r1) goto L20
        L1f:
            r2 = r3
        L20:
            yk.j.E0(r2)
            b5.a1 r0 = r4.f14174y0
            if (r0 != r5) goto L28
            return
        L28:
            d7.l r1 = r4.f14132c
            if (r0 == 0) goto L31
            i5.g0 r0 = (i5.g0) r0
            r0.J(r1)
        L31:
            r4.f14174y0 = r5
            if (r5 == 0) goto L3f
            i5.g0 r5 = (i5.g0) r5
            r1.getClass()
            k3.f r5 = r5.f19466l
            r5.a(r1)
        L3f:
            r4.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.x.setPlayer(b5.a1):void");
    }

    public void setProgressUpdateListener(p pVar) {
    }

    public void setRepeatToggleModes(int i10) {
        this.H0 = i10;
        a1 a1Var = this.f14174y0;
        boolean z10 = false;
        if (a1Var != null && ((b5.i) a1Var).b(15)) {
            i5.g0 g0Var = (i5.g0) this.f14174y0;
            g0Var.X();
            int i11 = g0Var.E;
            if (i10 == 0 && i11 != 0) {
                ((i5.g0) this.f14174y0).P(0);
            } else if (i10 == 1 && i11 == 2) {
                ((i5.g0) this.f14174y0).P(1);
            } else if (i10 == 2 && i11 == 1) {
                ((i5.g0) this.f14174y0).P(2);
            }
        }
        if (i10 != 0) {
            z10 = true;
        }
        this.f14130a.i(this.f14163t, z10);
        p();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f14130a.i(this.f14155p, z10);
        l();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.C0 = z10;
        s();
    }

    public void setShowNextButton(boolean z10) {
        this.f14130a.i(this.f14152n, z10);
        l();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f14130a.i(this.f14150m, z10);
        l();
    }

    public void setShowRewindButton(boolean z10) {
        this.f14130a.i(this.f14157q, z10);
        l();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f14130a.i(this.f14165u, z10);
        r();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f14130a.i(this.f14169w, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.F0 = i10;
        if (h()) {
            this.f14130a.h();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f14130a.i(this.f14167v, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.G0 = e5.x.i(i10, 16, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z10;
        View view = this.f14167v;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            k(view, z10);
        }
    }

    public final void t() {
        boolean z10;
        k kVar = this.f14140h;
        kVar.getClass();
        kVar.f14128e = Collections.emptyList();
        k kVar2 = this.f14142i;
        kVar2.getClass();
        kVar2.f14128e = Collections.emptyList();
        a1 a1Var = this.f14174y0;
        boolean z11 = true;
        ImageView imageView = this.f14169w;
        if (a1Var != null && ((b5.i) a1Var).b(30) && ((b5.i) this.f14174y0).b(29)) {
            o1 x10 = ((i5.g0) this.f14174y0).x();
            kVar2.w(f(x10, 1));
            if (this.f14130a.c(imageView)) {
                kVar.w(f(x10, 3));
            } else {
                kVar.w(j1.f24998e);
            }
        }
        if (kVar.a() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k(imageView, z10);
        r rVar = this.f14136f;
        if (!rVar.p(1) && !rVar.p(0)) {
            z11 = false;
        }
        k(this.f14175z, z11);
    }
}
