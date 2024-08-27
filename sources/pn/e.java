package pn;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d4.b1;
import d4.n1;
import d4.u0;
import d4.v0;
import d4.w0;
import d4.y0;
import d4.z0;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import jp.w;
import mo.d0;
import o2.k0;
import t7.x;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ll.a f31234a = new ll.a(15);

    /* renamed from: b, reason: collision with root package name */
    public static final ll.e f31235b = new ll.e(15);

    /* renamed from: c, reason: collision with root package name */
    public static final ll.f f31236c = new ll.f(15);

    public static IBinder a(Class cls, w wVar, w wVar2, IBinder iBinder) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            return (IBinder) cls.getConstructor(IBinder.class, IBinder.class, IBinder.class, Boolean.TYPE).newInstance(wVar, wVar2, iBinder, Boolean.FALSE);
        } catch (IllegalAccessException e10) {
            String name = cls.getName();
            if (name.length() != 0) {
                str4 = "Unable to call the default constructor of ".concat(name);
            } else {
                str4 = new String("Unable to call the default constructor of ");
            }
            throw new Exception(str4, e10);
        } catch (InstantiationException e11) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str3 = "Unable to instantiate the dynamic class ".concat(name2);
            } else {
                str3 = new String("Unable to instantiate the dynamic class ");
            }
            throw new Exception(str3, e11);
        } catch (NoSuchMethodException e12) {
            String name3 = cls.getName();
            if (name3.length() != 0) {
                str2 = "Could not find the right constructor for ".concat(name3);
            } else {
                str2 = new String("Could not find the right constructor for ");
            }
            throw new Exception(str2, e12);
        } catch (InvocationTargetException e13) {
            String name4 = cls.getName();
            if (name4.length() != 0) {
                str = "Exception thrown by invoked constructor in ".concat(name4);
            } else {
                str = new String("Exception thrown by invoked constructor in ");
            }
            throw new Exception(str, e13);
        }
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                v3.b.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                v3.b.h(drawable, colorStateList);
            }
            if (mode != null) {
                v3.b.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static int c(int i10, int i11) {
        return u3.a.d(i10, (Color.alpha(i10) * i11) / 255);
    }

    public static ImageView.ScaleType d(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static void e(View view, d0 d0Var) {
        WeakHashMap weakHashMap = n1.f13788a;
        b1.u(view, new w6.e(d0Var, new v5.i(w0.f(view), view.getPaddingTop(), w0.e(view), view.getPaddingBottom())));
        if (y0.b(view)) {
            z0.c(view);
        } else {
            view.addOnAttachStateChangeListener(new m4.h(1));
        }
    }

    public static float f(int i10, Context context) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static Object h(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static int i(Context context, int i10, int i11) {
        TypedValue u10 = u(i10, context);
        if (u10 != null) {
            int i12 = u10.resourceId;
            if (i12 != 0) {
                return r3.k.getColor(context, i12);
            }
            return u10.data;
        }
        return i11;
    }

    public static int j(Context context, int i10, String str) {
        TypedValue w10 = w(context, i10, str);
        int i11 = w10.resourceId;
        if (i11 != 0) {
            return r3.k.getColor(context, i11);
        }
        return w10.data;
    }

    public static int k(View view, int i10) {
        Context context = view.getContext();
        TypedValue w10 = w(view.getContext(), i10, view.getClass().getCanonicalName());
        int i11 = w10.resourceId;
        if (i11 != 0) {
            return r3.k.getColor(context, i11);
        }
        return w10.data;
    }

    public static ViewGroup l(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static x m(View view) {
        ViewGroup l10 = l(view);
        if (l10 == null) {
            return null;
        }
        return new x(l10, 1);
    }

    public static boolean n(int i10) {
        boolean z10;
        double pow;
        double pow2;
        double pow3;
        if (i10 != 0) {
            ThreadLocal threadLocal = u3.a.f36702a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i10);
            int green = Color.green(i10);
            int blue = Color.blue(i10);
            if (dArr.length == 3) {
                double d10 = red / 255.0d;
                if (d10 < 0.04045d) {
                    pow = d10 / 12.92d;
                } else {
                    pow = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                }
                double d11 = green / 255.0d;
                if (d11 < 0.04045d) {
                    pow2 = d11 / 12.92d;
                } else {
                    pow2 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                }
                double d12 = blue / 255.0d;
                if (d12 < 0.04045d) {
                    pow3 = d12 / 12.92d;
                } else {
                    pow3 = Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
                }
                z10 = false;
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d13 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d13;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d13 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    public static boolean o(View view) {
        WeakHashMap weakHashMap = n1.f13788a;
        if (w0.d(view) == 1) {
            return true;
        }
        return false;
    }

    public static int p(int i10, float f10, int i11) {
        return u3.a.b(u3.a.d(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    public static String q(String str, Object... objArr) {
        int indexOf;
        String str2;
        String sb2;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb4);
                    if (valueOf.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str2, (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(name2.length() + String.valueOf(sb4).length() + 9);
                    sb5.append(UrlTreeKt.configurablePathSegmentPrefix);
                    sb5.append(sb4);
                    sb5.append(" threw ");
                    sb5.append(name2);
                    sb5.append(UrlTreeKt.configurablePathSegmentSuffix);
                    sb2 = sb5.toString();
                }
            }
            objArr[i11] = sb2;
        }
        StringBuilder sb6 = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (indexOf = str.indexOf("%s", i12)) != -1) {
            sb6.append((CharSequence) str, i12, indexOf);
            sb6.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb6.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
            sb6.append(" [");
            sb6.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb6.append(", ");
                sb6.append(objArr[i13]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }

    public static Typeface r(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 31 && a4.c.a(configuration) != Integer.MAX_VALUE && a4.c.a(configuration) != 0 && typeface != null) {
            return k0.c(typeface, hl.f.F(a4.c.a(configuration) + k0.a(typeface), 1, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), typeface.isItalic());
        }
        return null;
    }

    public static PorterDuff.Mode s(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void t(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            v3.b.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static TypedValue u(int i10, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean v(Context context, int i10, boolean z10) {
        TypedValue u10 = u(i10, context);
        if (u10 != null && u10.type == 18) {
            if (u10.data != 0) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public static TypedValue w(Context context, int i10, String str) {
        TypedValue u10 = u(i10, context);
        if (u10 != null) {
            return u10;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    public static void x(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z10;
        WeakHashMap weakHashMap = n1.f13788a;
        boolean a10 = u0.a(checkableImageButton);
        boolean z11 = false;
        int i10 = 1;
        if (onLongClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (a10 || z10) {
            z11 = true;
        }
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(a10);
        checkableImageButton.setPressable(a10);
        checkableImageButton.setLongClickable(z10);
        if (!z11) {
            i10 = 2;
        }
        v0.s(checkableImageButton, i10);
    }
}
