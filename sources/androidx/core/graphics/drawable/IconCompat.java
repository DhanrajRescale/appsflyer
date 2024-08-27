package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import s0.g;
import v3.d;
import v3.f;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1503k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f1504a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1505b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1506c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1507d;

    /* renamed from: e, reason: collision with root package name */
    public int f1508e;

    /* renamed from: f, reason: collision with root package name */
    public int f1509f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1510g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1511h;

    /* renamed from: i, reason: collision with root package name */
    public String f1512i;

    /* renamed from: j, reason: collision with root package name */
    public String f1513j;

    public IconCompat() {
        this.f1504a = -1;
        this.f1506c = null;
        this.f1507d = null;
        this.f1508e = 0;
        this.f1509f = 0;
        this.f1510g = null;
        this.f1511h = f1503k;
        this.f1512i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, g.f34069a, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, g.f34069a, g.f34069a, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(String str, int i10) {
        str.getClass();
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1508e = i10;
            iconCompat.f1505b = str;
            iconCompat.f1513j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i10 = this.f1504a;
        if (i10 == -1) {
            Object obj = this.f1505b;
            if (Build.VERSION.SDK_INT >= 28) {
                return f.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }
        if (i10 == 2) {
            return this.f1508e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri d() {
        int i10 = this.f1504a;
        if (i10 == -1) {
            return d.a(this.f1505b);
        }
        if (i10 != 4 && i10 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f1505b);
    }

    public final String toString() {
        String str;
        if (this.f1504a == -1) {
            return String.valueOf(this.f1505b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1504a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1504a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1505b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1505b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1513j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1508e);
                if (this.f1509f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1509f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1505b);
                break;
        }
        if (this.f1510g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1510g);
        }
        if (this.f1511h != f1503k) {
            sb2.append(" mode=");
            sb2.append(this.f1511h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f1506c = null;
        this.f1507d = null;
        this.f1508e = 0;
        this.f1509f = 0;
        this.f1510g = null;
        this.f1511h = f1503k;
        this.f1512i = null;
        this.f1504a = i10;
    }
}
