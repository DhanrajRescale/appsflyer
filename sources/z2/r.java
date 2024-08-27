package z2;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import c2.p0;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qu.i0;
import t0.j0;
import t0.n1;
import t0.o3;
import t0.x1;

/* loaded from: classes.dex */
public final class r extends d2.a {
    public final int[] A;

    /* renamed from: i */
    public Function0 f41955i;

    /* renamed from: j */
    public u f41956j;

    /* renamed from: k */
    public String f41957k;

    /* renamed from: l */
    public final View f41958l;

    /* renamed from: m */
    public final mt.p f41959m;

    /* renamed from: n */
    public final WindowManager f41960n;

    /* renamed from: o */
    public final WindowManager.LayoutParams f41961o;

    /* renamed from: p */
    public t f41962p;

    /* renamed from: q */
    public w2.k f41963q;

    /* renamed from: r */
    public final n1 f41964r;

    /* renamed from: s */
    public final n1 f41965s;

    /* renamed from: t */
    public w2.i f41966t;

    /* renamed from: u */
    public final j0 f41967u;

    /* renamed from: v */
    public final Rect f41968v;

    /* renamed from: w */
    public final e1.v f41969w;

    /* renamed from: x */
    public Object f41970x;

    /* renamed from: y */
    public final n1 f41971y;

    /* renamed from: z */
    public boolean f41972z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [mt.p] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public r(Function0 function0, u uVar, String str, View view, w2.b bVar, t tVar, UUID uuid) {
        super(view.getContext());
        ?? r02;
        if (Build.VERSION.SDK_INT >= 29) {
            r02 = new Object();
        } else {
            r02 = new Object();
        }
        this.f41955i = function0;
        this.f41956j = uVar;
        this.f41957k = str;
        this.f41958l = view;
        this.f41959m = r02;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f41960n = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f41961o = layoutParams;
        this.f41962p = tVar;
        this.f41963q = w2.k.f38799a;
        o3 o3Var = o3.f35116a;
        this.f41964r = t0.t.n0(null, o3Var);
        this.f41965s = t0.t.n0(null, o3Var);
        this.f41967u = t0.t.N(new p0(this, 8));
        this.f41968v = new Rect();
        this.f41969w = new e1.v(new h(this, 2));
        setId(android.R.id.content);
        yk.j.r1(this, yk.j.W0(view));
        i0.H(this, i0.r(view));
        yk.g.Z(this, yk.g.w(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(bVar.c0((float) 8));
        setOutlineProvider(new o0.j(3));
        this.f41971y = t0.t.n0(m.f41937a, o3Var);
        this.A = new int[2];
    }

    private final Function2<t0.n, Integer, Unit> getContent() {
        return (Function2) this.f41971y.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public final a2.u getParentLayoutCoordinates() {
        return (a2.u) this.f41965s.getValue();
    }

    public static final /* synthetic */ a2.u h(r rVar) {
        return rVar.getParentLayoutCoordinates();
    }

    private final void setClippingEnabled(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = this.f41961o;
        if (z10) {
            i10 = layoutParams.flags & (-513);
        } else {
            i10 = layoutParams.flags | 512;
        }
        layoutParams.flags = i10;
        this.f41959m.getClass();
        this.f41960n.updateViewLayout(this, layoutParams);
    }

    private final void setContent(Function2<? super t0.n, ? super Integer, Unit> function2) {
        this.f41971y.setValue(function2);
    }

    private final void setIsFocusable(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = this.f41961o;
        if (!z10) {
            i10 = layoutParams.flags | 8;
        } else {
            i10 = layoutParams.flags & (-9);
        }
        layoutParams.flags = i10;
        this.f41959m.getClass();
        this.f41960n.updateViewLayout(this, layoutParams);
    }

    private final void setParentLayoutCoordinates(a2.u uVar) {
        this.f41965s.setValue(uVar);
    }

    private final void setSecurePolicy(v vVar) {
        int i10;
        boolean b10 = i.b(this.f41958l);
        int ordinal = vVar.ordinal();
        if (ordinal != 0) {
            b10 = true;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    b10 = false;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        WindowManager.LayoutParams layoutParams = this.f41961o;
        if (b10) {
            i10 = layoutParams.flags | UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            i10 = layoutParams.flags & (-8193);
        }
        layoutParams.flags = i10;
        this.f41959m.getClass();
        this.f41960n.updateViewLayout(this, layoutParams);
    }

    @Override // d2.a
    public final void a(t0.n nVar, int i10) {
        int i11;
        int i12;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-857613600);
        if ((i10 & 6) == 0) {
            if (rVar.j(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && rVar.G()) {
            rVar.V();
        } else {
            getContent().invoke(rVar, 0);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new w.p0(i10, 12, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f41956j.f41974b) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.f41955i;
                if (function0 != null) {
                    function0.mo2invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // d2.a
    public final void e(int i10, int i11, int i12, int i13, boolean z10) {
        super.e(i10, i11, i12, i13, z10);
        this.f41956j.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f41961o;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f41959m.getClass();
        this.f41960n.updateViewLayout(this, layoutParams);
    }

    @Override // d2.a
    public final void f(int i10, int i11) {
        this.f41956j.getClass();
        super.f(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f41967u.getValue()).booleanValue();
    }

    @NotNull
    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f41961o;
    }

    @NotNull
    public final w2.k getParentLayoutDirection() {
        return this.f41963q;
    }

    /* renamed from: getPopupContentSize-bOM6tXw */
    public final w2.j m160getPopupContentSizebOM6tXw() {
        return (w2.j) this.f41964r.getValue();
    }

    @NotNull
    public final t getPositionProvider() {
        return this.f41962p;
    }

    @Override // d2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f41972z;
    }

    @NotNull
    public d2.a getSubCompositionView() {
        return this;
    }

    @NotNull
    public final String getTestTag() {
        return this.f41957k;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void i(t0.v vVar, Function2 function2) {
        setParentCompositionContext(vVar);
        setContent(function2);
        this.f41972z = true;
    }

    public final void j(Function0 function0, u uVar, String str, w2.k kVar) {
        int i10;
        this.f41955i = function0;
        uVar.getClass();
        this.f41956j = uVar;
        this.f41957k = str;
        setIsFocusable(uVar.f41973a);
        setSecurePolicy(v.f41977a);
        setClippingEnabled(uVar.f41976d);
        int ordinal = kVar.ordinal();
        if (ordinal != 0) {
            i10 = 1;
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i10 = 0;
        }
        super.setLayoutDirection(i10);
    }

    public final void k() {
        a2.u parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.m()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long q10 = parentLayoutCoordinates.q();
                long g10 = parentLayoutCoordinates.g(m1.c.f27233b);
                long j10 = hl.f.j(Math.round(m1.c.d(g10)), Math.round(m1.c.e(g10)));
                int i10 = w2.h.f38792c;
                int i11 = (int) (j10 >> 32);
                int i12 = (int) (j10 & 4294967295L);
                w2.i iVar = new w2.i(i11, i12, ((int) (q10 >> 32)) + i11, ((int) (q10 & 4294967295L)) + i12);
                if (!Intrinsics.a(iVar, this.f41966t)) {
                    this.f41966t = iVar;
                    m();
                }
            }
        }
    }

    public final void l(a2.u uVar) {
        setParentLayoutCoordinates(uVar);
        k();
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [iu.y, java.lang.Object] */
    public final void m() {
        w2.j m160getPopupContentSizebOM6tXw;
        w2.i iVar = this.f41966t;
        if (iVar != null && (m160getPopupContentSizebOM6tXw = m160getPopupContentSizebOM6tXw()) != null) {
            long j10 = m160getPopupContentSizebOM6tXw.f38798a;
            mt.p pVar = this.f41959m;
            pVar.getClass();
            View view = this.f41958l;
            Rect rect = this.f41968v;
            view.getWindowVisibleDisplayFrame(rect);
            long k10 = hl.f.k(rect.right - rect.left, rect.bottom - rect.top);
            ?? obj = new Object();
            obj.f20559a = w2.h.f38791b;
            this.f41969w.c(this, b.f41912g, new q(obj, this, iVar, k10, j10));
            WindowManager.LayoutParams layoutParams = this.f41961o;
            long j11 = obj.f20559a;
            layoutParams.x = (int) (j11 >> 32);
            layoutParams.y = (int) (j11 & 4294967295L);
            this.f41956j.getClass();
            pVar.E(this, (int) (k10 >> 32), (int) (k10 & 4294967295L));
            this.f41960n.updateViewLayout(this, layoutParams);
        }
    }

    @Override // d2.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e1.v vVar = this.f41969w;
        vVar.f14938g = yq.b.k(vVar.f14935d);
        if (this.f41956j.f41974b && Build.VERSION.SDK_INT >= 33) {
            if (this.f41970x == null) {
                this.f41970x = j.a(this.f41955i);
            }
            j.b(this, this.f41970x);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e1.v vVar = this.f41969w;
        e1.h hVar = vVar.f14938g;
        if (hVar != null) {
            hVar.a();
        }
        vVar.b();
        if (Build.VERSION.SDK_INT >= 33) {
            j.c(this, this.f41970x);
        }
        this.f41970x = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f41956j.f41975c) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < s0.g.f34069a || motionEvent.getX() >= getWidth() || motionEvent.getY() < s0.g.f34069a || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.f41955i;
            if (function0 != null) {
                function0.mo2invoke();
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            Function0 function02 = this.f41955i;
            if (function02 != null) {
                function02.mo2invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(@NotNull w2.k kVar) {
        this.f41963q = kVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA */
    public final void m161setPopupContentSizefhxjrPA(w2.j jVar) {
        this.f41964r.setValue(jVar);
    }

    public final void setPositionProvider(@NotNull t tVar) {
        this.f41962p = tVar;
    }

    public final void setTestTag(@NotNull String str) {
        this.f41957k = str;
    }
}
