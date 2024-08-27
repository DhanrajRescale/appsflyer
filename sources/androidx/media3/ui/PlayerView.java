package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlaybackException;
import b5.a1;
import b5.i;
import b5.p1;
import b5.s;
import com.assetgro.stockgro.prod.R;
import d7.a;
import d7.d0;
import d7.e0;
import d7.f0;
import d7.h0;
import d7.m;
import d7.w;
import d7.x;
import i5.g0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l0.j;
import lp.o0;
import s0.g;
import x5.k;

/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2097z = 0;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f2098a;

    /* renamed from: b, reason: collision with root package name */
    public final AspectRatioFrameLayout f2099b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2100c;

    /* renamed from: d, reason: collision with root package name */
    public final View f2101d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2102e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f2103f;

    /* renamed from: g, reason: collision with root package name */
    public final SubtitleView f2104g;

    /* renamed from: h, reason: collision with root package name */
    public final View f2105h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f2106i;

    /* renamed from: j, reason: collision with root package name */
    public final x f2107j;

    /* renamed from: k, reason: collision with root package name */
    public final FrameLayout f2108k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f2109l;

    /* renamed from: m, reason: collision with root package name */
    public a1 f2110m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2111n;

    /* renamed from: o, reason: collision with root package name */
    public w f2112o;

    /* renamed from: p, reason: collision with root package name */
    public int f2113p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f2114q;

    /* renamed from: r, reason: collision with root package name */
    public int f2115r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2116s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f2117t;

    /* renamed from: u, reason: collision with root package name */
    public int f2118u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2119v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2120w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2121x;

    /* renamed from: y, reason: collision with root package name */
    public int f2122y;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        int i15;
        boolean z13;
        boolean z14;
        int i16;
        boolean z15;
        int i17;
        int i18;
        boolean z16;
        int i19;
        int i20;
        boolean z17;
        e0 e0Var = new e0(this);
        this.f2098a = e0Var;
        if (isInEditMode()) {
            this.f2099b = null;
            this.f2100c = null;
            this.f2101d = null;
            this.f2102e = false;
            this.f2103f = null;
            this.f2104g = null;
            this.f2105h = null;
            this.f2106i = null;
            this.f2107j = null;
            this.f2108k = null;
            this.f2109l = null;
            ImageView imageView = new ImageView(context);
            if (e5.x.f15050a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(e5.x.o(context, resources, 2131231086));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(e5.x.o(context, resources2, 2131231086));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h0.f14047d, 0, 0);
            try {
                z13 = obtainStyledAttributes.hasValue(28);
                i15 = obtainStyledAttributes.getColor(28, 0);
                int resourceId = obtainStyledAttributes.getResourceId(15, R.layout.exo_player_view);
                z14 = obtainStyledAttributes.getBoolean(33, true);
                i16 = obtainStyledAttributes.getInt(3, 1);
                int resourceId2 = obtainStyledAttributes.getResourceId(9, 0);
                boolean z18 = obtainStyledAttributes.getBoolean(34, true);
                int i21 = obtainStyledAttributes.getInt(29, 1);
                int i22 = obtainStyledAttributes.getInt(17, 0);
                int i23 = obtainStyledAttributes.getInt(26, 5000);
                boolean z19 = obtainStyledAttributes.getBoolean(11, true);
                boolean z20 = obtainStyledAttributes.getBoolean(4, true);
                int integer = obtainStyledAttributes.getInteger(23, 0);
                this.f2116s = obtainStyledAttributes.getBoolean(12, this.f2116s);
                boolean z21 = obtainStyledAttributes.getBoolean(10, true);
                obtainStyledAttributes.recycle();
                z10 = z19;
                z12 = z20;
                z15 = z18;
                i10 = i23;
                i13 = i21;
                i17 = resourceId;
                i12 = i22;
                z11 = z21;
                i11 = integer;
                i14 = resourceId2;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i10 = 5000;
            i11 = 0;
            z10 = true;
            i12 = 0;
            z11 = true;
            i13 = 1;
            i14 = 0;
            z12 = true;
            i15 = 0;
            z13 = false;
            z14 = true;
            i16 = 1;
            z15 = true;
            i17 = R.layout.exo_player_view;
        }
        LayoutInflater.from(context).inflate(i17, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f2099b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i12);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.f2100c = findViewById;
        if (findViewById != null && z13) {
            findViewById.setBackgroundColor(i15);
        }
        if (aspectRatioFrameLayout != null && i13 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        this.f2101d = new SurfaceView(context);
                    } else {
                        try {
                            int i24 = k.f40031b;
                            this.f2101d = (View) k.class.getConstructor(Context.class).newInstance(context);
                        } catch (Exception e10) {
                            throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                        }
                    }
                } else {
                    try {
                        int i25 = y5.k.f41207l;
                        this.f2101d = (View) y5.k.class.getConstructor(Context.class).newInstance(context);
                        z16 = true;
                        this.f2101d.setLayoutParams(layoutParams);
                        this.f2101d.setOnClickListener(e0Var);
                        i18 = 0;
                        this.f2101d.setClickable(false);
                        aspectRatioFrameLayout.addView(this.f2101d, 0);
                    } catch (Exception e11) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                }
            } else {
                this.f2101d = new TextureView(context);
            }
            z16 = false;
            this.f2101d.setLayoutParams(layoutParams);
            this.f2101d.setOnClickListener(e0Var);
            i18 = 0;
            this.f2101d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f2101d, 0);
        } else {
            i18 = 0;
            this.f2101d = null;
            z16 = false;
        }
        this.f2102e = z16;
        this.f2108k = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f2109l = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f2103f = imageView2;
        if (z14 && i16 != 0 && imageView2 != null) {
            i19 = i16;
        } else {
            i19 = i18;
        }
        this.f2113p = i19;
        if (i14 != 0) {
            this.f2114q = r3.k.getDrawable(getContext(), i14);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f2104g = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.f2105h = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f2115r = i11;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f2106i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        x xVar = (x) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (xVar != null) {
            this.f2107j = xVar;
        } else if (findViewById3 != null) {
            x xVar2 = new x(context, attributeSet);
            this.f2107j = xVar2;
            xVar2.setId(R.id.exo_controller);
            xVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(xVar2, indexOfChild);
        } else {
            this.f2107j = null;
        }
        x xVar3 = this.f2107j;
        if (xVar3 != null) {
            i20 = i10;
        } else {
            i20 = i18;
        }
        this.f2118u = i20;
        this.f2121x = z10;
        this.f2119v = z12;
        this.f2120w = z11;
        if (z15 && xVar3 != null) {
            z17 = 1;
        } else {
            z17 = i18;
        }
        this.f2111n = z17;
        if (xVar3 != null) {
            d0 d0Var = xVar3.f14130a;
            int i26 = d0Var.f14003z;
            if (i26 != 3 && i26 != 2) {
                d0Var.g();
                d0Var.j(2);
            }
            this.f2107j.f14133d.add(e0Var);
        }
        if (z15) {
            setClickable(true);
        }
        j();
    }

    public static void a(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != g.f34069a && height != g.f34069a && i10 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i10, f10, f11);
            RectF rectF = new RectF(g.f34069a, g.f34069a, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        a1 a1Var = this.f2110m;
        if (a1Var != null && ((i) a1Var).b(16) && ((g0) this.f2110m).E() && ((g0) this.f2110m).A()) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        boolean z11;
        if ((!b() || !this.f2120w) && m()) {
            x xVar = this.f2107j;
            if (xVar.h() && xVar.getShowTimeoutMs() <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean e10 = e();
            if (z10 || z11 || e10) {
                f(e10);
            }
        }
    }

    public final boolean d(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f2113p == 2) {
                    f10 = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f2099b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f10);
                }
                ImageView imageView = this.f2103f;
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        a1 a1Var = this.f2110m;
        if (a1Var != null && ((i) a1Var).b(16) && ((g0) this.f2110m).E()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 270 && keyCode != 22 && keyCode != 271 && keyCode != 20 && keyCode != 269 && keyCode != 21 && keyCode != 268 && keyCode != 23) {
            z10 = false;
        } else {
            z10 = true;
        }
        x xVar = this.f2107j;
        if (z10 && m() && !xVar.h()) {
            c(true);
        } else if ((m() && xVar.d(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            c(true);
        } else {
            if (!z10 || !m()) {
                return false;
            }
            c(true);
            return false;
        }
        return true;
    }

    public final boolean e() {
        a1 a1Var = this.f2110m;
        if (a1Var == null) {
            return true;
        }
        int B = ((g0) a1Var).B();
        if (this.f2119v && (!((i) this.f2110m).b(17) || !((g0) this.f2110m).w().q())) {
            if (B == 1 || B == 4) {
                return true;
            }
            a1 a1Var2 = this.f2110m;
            a1Var2.getClass();
            if (!((g0) a1Var2).A()) {
                return true;
            }
        }
        return false;
    }

    public final void f(boolean z10) {
        int i10;
        if (!m()) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = this.f2118u;
        }
        x xVar = this.f2107j;
        xVar.setShowTimeoutMs(i10);
        d0 d0Var = xVar.f14130a;
        x xVar2 = d0Var.f13978a;
        if (!xVar2.i()) {
            xVar2.setVisibility(0);
            xVar2.j();
            View view = xVar2.f14153o;
            if (view != null) {
                view.requestFocus();
            }
        }
        d0Var.l();
    }

    public final void g() {
        if (m() && this.f2110m != null) {
            x xVar = this.f2107j;
            if (!xVar.h()) {
                c(true);
            } else if (this.f2121x) {
                xVar.g();
            }
        }
    }

    public List<j> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f2109l;
        if (frameLayout != null) {
            arrayList.add(new j(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        x xVar = this.f2107j;
        if (xVar != null) {
            arrayList.add(new j(xVar, 1, (Serializable) null));
        }
        return o0.q(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f2108k;
        yk.j.J0(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f2113p;
    }

    public boolean getControllerAutoShow() {
        return this.f2119v;
    }

    public boolean getControllerHideOnTouch() {
        return this.f2121x;
    }

    public int getControllerShowTimeoutMs() {
        return this.f2118u;
    }

    public Drawable getDefaultArtwork() {
        return this.f2114q;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f2109l;
    }

    public a1 getPlayer() {
        return this.f2110m;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f2099b;
        yk.j.I0(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f2104g;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f2113p != 0;
    }

    public boolean getUseController() {
        return this.f2111n;
    }

    public View getVideoSurfaceView() {
        return this.f2101d;
    }

    public final void h() {
        p1 p1Var;
        float f10;
        a1 a1Var = this.f2110m;
        if (a1Var != null) {
            g0 g0Var = (g0) a1Var;
            g0Var.X();
            p1Var = g0Var.f19455e0;
        } else {
            p1Var = p1.f3567e;
        }
        int i10 = p1Var.f3568a;
        float f11 = g.f34069a;
        int i11 = p1Var.f3569b;
        if (i11 != 0 && i10 != 0) {
            f10 = (i10 * p1Var.f3571d) / i11;
        } else {
            f10 = 0.0f;
        }
        View view = this.f2101d;
        if (view instanceof TextureView) {
            int i12 = p1Var.f3570c;
            if (f10 > g.f34069a && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            int i13 = this.f2122y;
            e0 e0Var = this.f2098a;
            if (i13 != 0) {
                view.removeOnLayoutChangeListener(e0Var);
            }
            this.f2122y = i12;
            if (i12 != 0) {
                view.addOnLayoutChangeListener(e0Var);
            }
            a((TextureView) view, this.f2122y);
        }
        if (!this.f2102e) {
            f11 = f10;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f2099b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (((i5.g0) r5.f2110m).A() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r5 = this;
            android.view.View r0 = r5.f2105h
            if (r0 == 0) goto L2d
            b5.a1 r1 = r5.f2110m
            r2 = 0
            if (r1 == 0) goto L24
            i5.g0 r1 = (i5.g0) r1
            int r1 = r1.B()
            r3 = 2
            if (r1 != r3) goto L24
            int r1 = r5.f2115r
            r4 = 1
            if (r1 == r3) goto L25
            if (r1 != r4) goto L24
            b5.a1 r1 = r5.f2110m
            i5.g0 r1 = (i5.g0) r1
            boolean r1 = r1.A()
            if (r1 == 0) goto L24
            goto L25
        L24:
            r4 = r2
        L25:
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r2 = 8
        L2a:
            r0.setVisibility(r2)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.i():void");
    }

    public final void j() {
        String str = null;
        x xVar = this.f2107j;
        if (xVar != null && this.f2111n) {
            if (xVar.h()) {
                if (this.f2121x) {
                    str = getResources().getString(R.string.exo_controls_hide);
                }
                setContentDescription(str);
                return;
            }
            setContentDescription(getResources().getString(R.string.exo_controls_show));
            return;
        }
        setContentDescription(null);
    }

    public final void k() {
        TextView textView = this.f2106i;
        if (textView != null) {
            CharSequence charSequence = this.f2117t;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            a1 a1Var = this.f2110m;
            if (a1Var != null) {
                g0 g0Var = (g0) a1Var;
                g0Var.X();
                ExoPlaybackException exoPlaybackException = g0Var.f19459g0.f19367f;
            }
            textView.setVisibility(8);
        }
    }

    public final void l(boolean z10) {
        a1 a1Var = this.f2110m;
        View view = this.f2100c;
        ImageView imageView = this.f2103f;
        if (a1Var != null) {
            i iVar = (i) a1Var;
            if (iVar.b(30)) {
                g0 g0Var = (g0) a1Var;
                if (!g0Var.x().f3562a.isEmpty()) {
                    if (z10 && !this.f2116s && view != null) {
                        view.setVisibility(0);
                    }
                    if (g0Var.x().b(2)) {
                        if (imageView != null) {
                            imageView.setImageResource(android.R.color.transparent);
                            imageView.setVisibility(4);
                            return;
                        }
                        return;
                    }
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    if (this.f2113p != 0) {
                        yk.j.I0(imageView);
                        if (iVar.b(18)) {
                            g0 g0Var2 = (g0) iVar;
                            g0Var2.X();
                            byte[] bArr = g0Var2.N.f3530j;
                            if (bArr != null) {
                                if (d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)))) {
                                    return;
                                }
                            }
                        }
                        if (d(this.f2114q)) {
                            return;
                        }
                    }
                    if (imageView != null) {
                        imageView.setImageResource(android.R.color.transparent);
                        imageView.setVisibility(4);
                        return;
                    }
                    return;
                }
            }
        }
        if (!this.f2116s) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public final boolean m() {
        if (this.f2111n) {
            yk.j.I0(this.f2107j);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (m() && this.f2110m != null) {
            c(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        g();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        boolean z10;
        if (i10 != 0 && this.f2103f == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        yk.j.H0(z10);
        if (this.f2113p != i10) {
            this.f2113p = i10;
            l(false);
        }
    }

    public void setAspectRatioListener(a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f2099b;
        yk.j.I0(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f2119v = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f2120w = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        yk.j.I0(this.f2107j);
        this.f2121x = z10;
        j();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(m mVar) {
        x xVar = this.f2107j;
        yk.j.I0(xVar);
        xVar.setOnFullScreenModeChangedListener(mVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        x xVar = this.f2107j;
        yk.j.I0(xVar);
        this.f2118u = i10;
        if (xVar.h()) {
            f(e());
        }
    }

    public void setControllerVisibilityListener(f0 f0Var) {
        if (f0Var != null) {
            setControllerVisibilityListener((w) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z10;
        if (this.f2106i != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        this.f2117t = charSequence;
        k();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f2114q != drawable) {
            this.f2114q = drawable;
            l(false);
        }
    }

    public void setErrorMessageProvider(s sVar) {
        if (sVar != null) {
            k();
        }
    }

    public void setFullscreenButtonClickListener(d7.g0 g0Var) {
        x xVar = this.f2107j;
        yk.j.I0(xVar);
        xVar.setOnFullScreenModeChangedListener(this.f2098a);
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f2116s != z10) {
            this.f2116s = z10;
            l(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPlayer(b5.a1 r12) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.setPlayer(b5.a1):void");
    }

    public void setRepeatToggleModes(int i10) {
        x xVar = this.f2107j;
        yk.j.I0(xVar);
        xVar.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f2099b;
        yk.j.I0(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f2115r != i10) {
            this.f2115r = i10;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        x xVar = this.f2107j;
        yk.j.I0(xVar);
        xVar.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        x xVar = this.f2107j;
        yk.j.I0(xVar);
        xVar.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        x xVar = this.f2107j;
        yk.j.I0(xVar);
        xVar.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        x xVar = this.f2107j;
        yk.j.I0(xVar);
        xVar.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        x xVar = this.f2107j;
        yk.j.I0(xVar);
        xVar.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        x xVar = this.f2107j;
        yk.j.I0(xVar);
        xVar.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        x xVar = this.f2107j;
        yk.j.I0(xVar);
        xVar.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        x xVar = this.f2107j;
        yk.j.I0(xVar);
        xVar.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f2100c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    public void setUseController(boolean z10) {
        boolean z11;
        boolean z12 = true;
        x xVar = this.f2107j;
        if (z10 && xVar == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        yk.j.H0(z11);
        if (!z10 && !hasOnClickListeners()) {
            z12 = false;
        }
        setClickable(z12);
        if (this.f2111n == z10) {
            return;
        }
        this.f2111n = z10;
        if (m()) {
            xVar.setPlayer(this.f2110m);
        } else if (xVar != null) {
            xVar.g();
            xVar.setPlayer(null);
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f2101d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(w wVar) {
        x xVar = this.f2107j;
        yk.j.I0(xVar);
        w wVar2 = this.f2112o;
        if (wVar2 == wVar) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = xVar.f14133d;
        if (wVar2 != null) {
            copyOnWriteArrayList.remove(wVar2);
        }
        this.f2112o = wVar;
        if (wVar != null) {
            copyOnWriteArrayList.add(wVar);
            setControllerVisibilityListener((f0) null);
        }
    }
}
