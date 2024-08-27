package sm;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import b4.l;
import ba.mh;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailFragment;
import com.assetgro.stockgro.prod.R;
import ha.k;
import j9.w;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;
import tm.d;
import tm.e;
import tm.f;
import tm.i;
import um.g;
import um.h;

/* loaded from: classes2.dex */
public abstract class b extends ViewGroup implements xm.c {
    public float A;
    public boolean B;
    public d C;
    public final ArrayList D;
    public boolean E;

    /* renamed from: a, reason: collision with root package name */
    public boolean f34695a;

    /* renamed from: b, reason: collision with root package name */
    public g f34696b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34697c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34698d;

    /* renamed from: e, reason: collision with root package name */
    public float f34699e;

    /* renamed from: f, reason: collision with root package name */
    public final vm.b f34700f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f34701g;

    /* renamed from: h, reason: collision with root package name */
    public Paint f34702h;

    /* renamed from: i, reason: collision with root package name */
    public i f34703i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f34704j;

    /* renamed from: k, reason: collision with root package name */
    public tm.c f34705k;

    /* renamed from: l, reason: collision with root package name */
    public e f34706l;

    /* renamed from: m, reason: collision with root package name */
    public an.d f34707m;

    /* renamed from: n, reason: collision with root package name */
    public an.b f34708n;

    /* renamed from: o, reason: collision with root package name */
    public String f34709o;

    /* renamed from: p, reason: collision with root package name */
    public bn.e f34710p;

    /* renamed from: q, reason: collision with root package name */
    public bn.d f34711q;

    /* renamed from: r, reason: collision with root package name */
    public wm.d f34712r;

    /* renamed from: s, reason: collision with root package name */
    public final cn.i f34713s;

    /* renamed from: t, reason: collision with root package name */
    public qm.a f34714t;

    /* renamed from: u, reason: collision with root package name */
    public float f34715u;

    /* renamed from: v, reason: collision with root package name */
    public float f34716v;

    /* renamed from: w, reason: collision with root package name */
    public float f34717w;

    /* renamed from: x, reason: collision with root package name */
    public float f34718x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f34719y;

    /* renamed from: z, reason: collision with root package name */
    public wm.c[] f34720z;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34695a = false;
        this.f34696b = null;
        this.f34697c = true;
        this.f34698d = true;
        this.f34699e = 0.9f;
        this.f34700f = new vm.b(0);
        this.f34704j = true;
        this.f34709o = "No chart data available.";
        this.f34713s = new cn.i();
        this.f34715u = s0.g.f34069a;
        this.f34716v = s0.g.f34069a;
        this.f34717w = s0.g.f34069a;
        this.f34718x = s0.g.f34069a;
        this.f34719y = false;
        this.A = s0.g.f34069a;
        this.B = true;
        this.D = new ArrayList();
        this.E = false;
        h();
    }

    public static void j(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 < viewGroup.getChildCount()) {
                    j(viewGroup.getChildAt(i10));
                    i10++;
                } else {
                    viewGroup.removeAllViews();
                    return;
                }
            }
        }
    }

    public final void a() {
        qm.a aVar = this.f34714t;
        aVar.getClass();
        qm.b bVar = qm.c.f32092a;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar, "phaseX", s0.g.f34069a, 1.0f);
        ofFloat.setInterpolator(bVar);
        ofFloat.setDuration(800);
        ofFloat.addUpdateListener(aVar.f32090a);
        ofFloat.start();
    }

    public abstract void b();

    public final void c(Canvas canvas) {
        tm.c cVar = this.f34705k;
        if (cVar != null && cVar.f36180a) {
            Paint paint = this.f34701g;
            cVar.getClass();
            paint.setTypeface(null);
            this.f34701g.setTextSize(this.f34705k.f36183d);
            this.f34701g.setColor(this.f34705k.f36184e);
            this.f34701g.setTextAlign(this.f34705k.f36186g);
            float width = getWidth();
            cn.i iVar = this.f34713s;
            float f10 = (width - (iVar.f8276c - iVar.f8275b.right)) - this.f34705k.f36181b;
            float height = getHeight() - (iVar.f8277d - iVar.f8275b.bottom);
            tm.c cVar2 = this.f34705k;
            canvas.drawText(cVar2.f36185f, f10, height - cVar2.f36182c, this.f34701g);
        }
    }

    public final void d(Canvas canvas) {
        if (this.C != null && this.B && k()) {
            int i10 = 0;
            while (true) {
                wm.c[] cVarArr = this.f34720z;
                if (i10 < cVarArr.length) {
                    wm.c cVar = cVarArr[i10];
                    ym.b b10 = this.f34696b.b(cVar.f39311e);
                    um.i e10 = this.f34696b.e(this.f34720z[i10]);
                    h hVar = (h) b10;
                    int indexOf = hVar.f37272p.indexOf(e10);
                    if (e10 != null) {
                        float f10 = indexOf;
                        float size = hVar.f37272p.size();
                        this.f34714t.getClass();
                        if (f10 <= size * 1.0f) {
                            float[] f11 = f(cVar);
                            float f12 = f11[0];
                            float f13 = f11[1];
                            cn.i iVar = this.f34713s;
                            if (iVar.b(f12) && iVar.c(f12) && iVar.d(f13)) {
                                this.C.b(e10, cVar);
                                this.C.a(canvas, f11[0], f11[1]);
                            }
                        }
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public wm.c e(float f10, float f11) {
        if (this.f34696b == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        return getHighlighter().f(f10, f11);
    }

    public float[] f(wm.c cVar) {
        return new float[]{cVar.f39314h, cVar.f39315i};
    }

    public final void g(wm.c cVar) {
        um.i iVar = null;
        if (cVar == null) {
            this.f34720z = null;
        } else {
            if (this.f34695a) {
                Log.i("MPAndroidChart", "Highlighted: " + cVar.toString());
            }
            um.i e10 = this.f34696b.e(cVar);
            if (e10 == null) {
                this.f34720z = null;
            } else {
                this.f34720z = new wm.c[]{cVar};
            }
            iVar = e10;
        }
        setLastHighlighted(this.f34720z);
        if (this.f34707m != null) {
            if (!k()) {
                OptionDetailFragment optionDetailFragment = ((k) this.f34707m).f18090a;
                ((mh) optionDetailFragment.q()).C.setText("--");
                ((mh) optionDetailFragment.q()).C.setTextColor(r3.k.getColor(optionDetailFragment.requireContext(), R.color.green_new));
            } else {
                k kVar = (k) this.f34707m;
                kVar.getClass();
                if (iVar != null) {
                    float a10 = iVar.a();
                    OptionDetailFragment optionDetailFragment2 = kVar.f18090a;
                    if (a10 >= s0.g.f34069a) {
                        ((mh) optionDetailFragment2.q()).C.setTextColor(r3.k.getColor(optionDetailFragment2.requireContext(), R.color.green_new));
                    } else {
                        ((mh) optionDetailFragment2.q()).C.setTextColor(r3.k.getColor(optionDetailFragment2.requireContext(), R.color.red_new));
                    }
                    mh mhVar = (mh) optionDetailFragment2.q();
                    ij.h hVar = ij.h.f20067a;
                    mhVar.C.setText(ij.h.l(iVar.a()));
                }
            }
        }
        invalidate();
    }

    public qm.a getAnimator() {
        return this.f34714t;
    }

    public cn.d getCenter() {
        return cn.d.b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public cn.d getCenterOfView() {
        return getCenter();
    }

    public cn.d getCenterOffsets() {
        RectF rectF = this.f34713s.f8275b;
        return cn.d.b(rectF.centerX(), rectF.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return createBitmap;
    }

    public RectF getContentRect() {
        return this.f34713s.f8275b;
    }

    public g getData() {
        return this.f34696b;
    }

    public vm.c getDefaultValueFormatter() {
        return this.f34700f;
    }

    public tm.c getDescription() {
        return this.f34705k;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.f34699e;
    }

    public float getExtraBottomOffset() {
        return this.f34717w;
    }

    public float getExtraLeftOffset() {
        return this.f34718x;
    }

    public float getExtraRightOffset() {
        return this.f34716v;
    }

    public float getExtraTopOffset() {
        return this.f34715u;
    }

    public wm.c[] getHighlighted() {
        return this.f34720z;
    }

    public wm.d getHighlighter() {
        return this.f34712r;
    }

    public ArrayList<Runnable> getJobs() {
        return this.D;
    }

    public e getLegend() {
        return this.f34706l;
    }

    public bn.e getLegendRenderer() {
        return this.f34710p;
    }

    public d getMarker() {
        return this.C;
    }

    @Deprecated
    public d getMarkerView() {
        return getMarker();
    }

    @Override // xm.c
    public float getMaxHighlightDistance() {
        return this.A;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public an.c getOnChartGestureListener() {
        return null;
    }

    public an.b getOnTouchListener() {
        return this.f34708n;
    }

    public bn.d getRenderer() {
        return this.f34711q;
    }

    public cn.i getViewPortHandler() {
        return this.f34713s;
    }

    public i getXAxis() {
        return this.f34703i;
    }

    public float getXChartMax() {
        return this.f34703i.D;
    }

    public float getXChartMin() {
        return this.f34703i.E;
    }

    public float getXRange() {
        return this.f34703i.F;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.f34696b.f37248a;
    }

    public float getYMin() {
        return this.f34696b.f37249b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, qm.a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [tm.i, tm.a, tm.b] */
    /* JADX WARN: Type inference failed for: r1v6, types: [tm.c, tm.b] */
    /* JADX WARN: Type inference failed for: r1v7, types: [tm.e, tm.b] */
    /* JADX WARN: Type inference failed for: r2v9, types: [b4.l, bn.e] */
    public void h() {
        setWillNotDraw(false);
        w wVar = new w(this, 2);
        ?? obj = new Object();
        obj.f32090a = wVar;
        this.f34714t = obj;
        Context context = getContext();
        DisplayMetrics displayMetrics = cn.h.f8264a;
        if (context == null) {
            cn.h.f8265b = ViewConfiguration.getMinimumFlingVelocity();
            cn.h.f8266c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            cn.h.f8265b = viewConfiguration.getScaledMinimumFlingVelocity();
            cn.h.f8266c = viewConfiguration.getScaledMaximumFlingVelocity();
            cn.h.f8264a = context.getResources().getDisplayMetrics();
        }
        this.A = cn.h.c(500.0f);
        ?? bVar = new tm.b();
        bVar.f36185f = "Description Label";
        bVar.f36186g = Paint.Align.RIGHT;
        bVar.f36183d = cn.h.c(8.0f);
        this.f34705k = bVar;
        ?? bVar2 = new tm.b();
        bVar2.f36187f = new f[0];
        bVar2.f36188g = 1;
        bVar2.f36189h = 3;
        bVar2.f36190i = 1;
        bVar2.f36191j = false;
        bVar2.f36192k = 1;
        bVar2.f36193l = 4;
        bVar2.f36194m = 8.0f;
        bVar2.f36195n = 3.0f;
        bVar2.f36196o = 6.0f;
        bVar2.f36197p = s0.g.f34069a;
        bVar2.f36198q = 5.0f;
        bVar2.f36199r = 3.0f;
        bVar2.f36200s = 0.95f;
        bVar2.f36201t = s0.g.f34069a;
        bVar2.f36202u = s0.g.f34069a;
        bVar2.f36203v = s0.g.f34069a;
        bVar2.f36204w = false;
        bVar2.f36205x = new ArrayList(16);
        bVar2.f36206y = new ArrayList(16);
        bVar2.f36207z = new ArrayList(16);
        bVar2.f36183d = cn.h.c(10.0f);
        bVar2.f36181b = cn.h.c(5.0f);
        bVar2.f36182c = cn.h.c(3.0f);
        this.f34706l = bVar2;
        ?? lVar = new l(this.f34713s, 8);
        lVar.f7155f = new ArrayList(16);
        lVar.f7156g = new Paint.FontMetrics();
        lVar.f7157h = new Path();
        lVar.f7154e = bVar2;
        Paint paint = new Paint(1);
        lVar.f7152c = paint;
        paint.setTextSize(cn.h.c(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        lVar.f7153d = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f34710p = lVar;
        ?? aVar = new tm.a();
        aVar.G = 1;
        aVar.H = false;
        aVar.I = 1;
        aVar.f36182c = cn.h.c(4.0f);
        this.f34703i = aVar;
        this.f34701g = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f34702h = paint3;
        paint3.setColor(Color.rgb(247, 189, 51));
        this.f34702h.setTextAlign(Paint.Align.CENTER);
        this.f34702h.setTextSize(cn.h.c(12.0f));
        if (this.f34695a) {
            Log.i(HttpUrl.FRAGMENT_ENCODE_SET, "Chart.init()");
        }
    }

    public abstract void i();

    public final boolean k() {
        wm.c[] cVarArr = this.f34720z;
        if (cVarArr == null || cVarArr.length <= 0 || cVarArr[0] == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.E) {
            j(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f34696b == null) {
            if (!TextUtils.isEmpty(this.f34709o)) {
                cn.d center = getCenter();
                canvas.drawText(this.f34709o, center.f8247b, center.f8248c, this.f34702h);
                return;
            }
            return;
        }
        if (!this.f34719y) {
            b();
            this.f34719y = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            getChildAt(i14).layout(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int c10 = (int) cn.h.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(c10, i10)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(c10, i11)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.f34695a) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (i10 > 0 && i11 > 0 && i10 < 10000 && i11 < 10000) {
            if (this.f34695a) {
                Log.i("MPAndroidChart", "Setting chart dimens, width: " + i10 + ", height: " + i11);
            }
            float f10 = i10;
            float f11 = i11;
            cn.i iVar = this.f34713s;
            RectF rectF = iVar.f8275b;
            float f12 = rectF.left;
            float f13 = rectF.top;
            float f14 = iVar.f8276c - rectF.right;
            float f15 = iVar.f8277d - rectF.bottom;
            iVar.f8277d = f11;
            iVar.f8276c = f10;
            rectF.set(f12, f13, f10 - f14, f11 - f15);
        } else if (this.f34695a) {
            Log.w("MPAndroidChart", "*Avoiding* setting chart dimens! width: " + i10 + ", height: " + i11);
        }
        i();
        ArrayList arrayList = this.D;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            post((Runnable) it.next());
        }
        arrayList.clear();
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public void setData(g gVar) {
        float abs;
        this.f34696b = gVar;
        int i10 = 0;
        this.f34719y = false;
        if (gVar == null) {
            return;
        }
        float f10 = gVar.f37249b;
        float f11 = gVar.f37248a;
        if (gVar.d() < 2) {
            abs = Math.max(Math.abs(f10), Math.abs(f11));
        } else {
            abs = Math.abs(f11 - f10);
        }
        float d10 = cn.h.d(abs);
        if (!Float.isInfinite(d10)) {
            i10 = ((int) Math.ceil(-Math.log10(d10))) + 2;
        }
        vm.b bVar = this.f34700f;
        bVar.b(i10);
        Iterator it = this.f34696b.f37256i.iterator();
        while (it.hasNext()) {
            h hVar = (h) ((ym.b) it.next());
            Object obj = hVar.f37262f;
            if (obj != null) {
                if (obj == null) {
                    obj = cn.h.f8271h;
                }
                if (obj == bVar) {
                }
            }
            hVar.f37262f = bVar;
        }
        i();
        if (this.f34695a) {
            Log.i("MPAndroidChart", "Data is set.");
        }
    }

    public void setDescription(tm.c cVar) {
        this.f34705k = cVar;
    }

    public void setDragDecelerationEnabled(boolean z10) {
        this.f34698d = z10;
    }

    public void setDragDecelerationFrictionCoef(float f10) {
        if (f10 < s0.g.f34069a) {
            f10 = 0.0f;
        }
        if (f10 >= 1.0f) {
            f10 = 0.999f;
        }
        this.f34699e = f10;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z10) {
        setDrawMarkers(z10);
    }

    public void setDrawMarkers(boolean z10) {
        this.B = z10;
    }

    public void setExtraBottomOffset(float f10) {
        this.f34717w = cn.h.c(f10);
    }

    public void setExtraLeftOffset(float f10) {
        this.f34718x = cn.h.c(f10);
    }

    public void setExtraRightOffset(float f10) {
        this.f34716v = cn.h.c(f10);
    }

    public void setExtraTopOffset(float f10) {
        this.f34715u = cn.h.c(f10);
    }

    public void setHardwareAccelerationEnabled(boolean z10) {
        if (z10) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z10) {
        this.f34697c = z10;
    }

    public void setHighlighter(wm.b bVar) {
        this.f34712r = bVar;
    }

    public void setLastHighlighted(wm.c[] cVarArr) {
        wm.c cVar;
        if (cVarArr != null && cVarArr.length > 0 && (cVar = cVarArr[0]) != null) {
            this.f34708n.f784b = cVar;
        } else {
            this.f34708n.f784b = null;
        }
    }

    public void setLogEnabled(boolean z10) {
        this.f34695a = z10;
    }

    public void setMarker(d dVar) {
        this.C = dVar;
    }

    @Deprecated
    public void setMarkerView(d dVar) {
        setMarker(dVar);
    }

    public void setMaxHighlightDistance(float f10) {
        this.A = cn.h.c(f10);
    }

    public void setNoDataText(String str) {
        this.f34709o = str;
    }

    public void setNoDataTextColor(int i10) {
        this.f34702h.setColor(i10);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.f34702h.setTypeface(typeface);
    }

    public void setOnChartGestureListener(an.c cVar) {
    }

    public void setOnChartValueSelectedListener(an.d dVar) {
        this.f34707m = dVar;
    }

    public void setOnTouchListener(an.b bVar) {
        this.f34708n = bVar;
    }

    public void setRenderer(bn.d dVar) {
        if (dVar != null) {
            this.f34711q = dVar;
        }
    }

    public void setTouchEnabled(boolean z10) {
        this.f34704j = z10;
    }

    public void setUnbindEnabled(boolean z10) {
        this.E = z10;
    }
}
