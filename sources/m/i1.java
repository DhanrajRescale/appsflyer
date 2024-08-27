package m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f25545l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f25546m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f25547a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25548b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f25549c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f25550d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f25551e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f25552f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f25553g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f25554h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f25555i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f25556j;

    /* renamed from: k, reason: collision with root package name */
    public final f1 f25557k;

    static {
        new ConcurrentHashMap();
    }

    public i1(TextView textView) {
        this.f25555i = textView;
        this.f25556j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f25557k = new g1();
        } else {
            this.f25557k = new f1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f25546m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(String str, Object obj, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        int measuredWidth;
        if (!f()) {
            return;
        }
        if (this.f25548b) {
            if (this.f25555i.getMeasuredHeight() > 0 && this.f25555i.getMeasuredWidth() > 0) {
                if (this.f25557k.b(this.f25555i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f25555i.getMeasuredWidth() - this.f25555i.getTotalPaddingLeft()) - this.f25555i.getTotalPaddingRight();
                }
                int height = (this.f25555i.getHeight() - this.f25555i.getCompoundPaddingBottom()) - this.f25555i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f25545l;
                    synchronized (rectF) {
                        try {
                            rectF.setEmpty();
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float c10 = c(rectF);
                            if (c10 != this.f25555i.getTextSize()) {
                                g(0, c10);
                            }
                        } finally {
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f25548b = true;
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f25552f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 0;
            int i12 = 1;
            while (i12 <= i10) {
                int i13 = (i12 + i10) / 2;
                int i14 = this.f25552f[i13];
                TextView textView = this.f25555i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int b10 = c1.b(textView);
                TextPaint textPaint = this.f25554h;
                if (textPaint == null) {
                    this.f25554h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f25554h.set(textView.getPaint());
                this.f25554h.setTextSize(i14);
                StaticLayout a10 = e1.a(text, (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b10, this.f25555i, this.f25554h, this.f25557k);
                if ((b10 != -1 && (a10.getLineCount() > b10 || a10.getLineEnd(a10.getLineCount() - 1) != text.length())) || a10.getHeight() > rectF.bottom) {
                    i11 = i13 - 1;
                    i10 = i11;
                } else {
                    int i15 = i13 + 1;
                    i11 = i12;
                    i12 = i15;
                }
            }
            return this.f25552f[i11];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() && this.f25547a != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i10, float f10) {
        Resources resources;
        Context context = this.f25556j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        TextView textView = this.f25555i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a10 = d1.a(textView);
            if (textView.getLayout() != null) {
                this.f25548b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!a10) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f25547a == 1) {
            if (!this.f25553g || this.f25552f.length == 0) {
                int floor = ((int) Math.floor((this.f25551e - this.f25550d) / this.f25549c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f25549c) + this.f25550d);
                }
                this.f25552f = b(iArr);
            }
            this.f25548b = true;
        } else {
            this.f25548b = false;
        }
        return this.f25548b;
    }

    public final boolean i() {
        boolean z10;
        if (this.f25552f.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25553g = z10;
        if (z10) {
            this.f25547a = 1;
            this.f25550d = r0[0];
            this.f25551e = r0[r1 - 1];
            this.f25549c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f25555i instanceof z);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 > s0.g.f34069a) {
            if (f11 > f10) {
                if (f12 > s0.g.f34069a) {
                    this.f25547a = 1;
                    this.f25550d = f10;
                    this.f25551e = f11;
                    this.f25549c = f12;
                    this.f25553g = false;
                    return;
                }
                throw new IllegalArgumentException(jr.h.m("The auto-size step granularity (", f12, "px) is less or equal to (0px)"));
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        throw new IllegalArgumentException(jr.h.m("Minimum auto-size text size (", f10, "px) is less or equal to (0px)"));
    }
}
