package v3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class d {
    public static Uri a(@NonNull Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return f.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon c(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        int i10 = iconCompat.f1504a;
        String str = null;
        r1 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i10) {
            case -1:
                return (Icon) iconCompat.f1505b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f1505b);
                break;
            case 2:
                if (i10 == -1) {
                    Object obj = iconCompat.f1505b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = f.b(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
                        } catch (IllegalAccessException e10) {
                            Log.e("IconCompat", "Unable to get icon package", e10);
                        } catch (NoSuchMethodException e11) {
                            Log.e("IconCompat", "Unable to get icon package", e11);
                        } catch (InvocationTargetException e12) {
                            Log.e("IconCompat", "Unable to get icon package", e12);
                        }
                    }
                } else if (i10 == 2) {
                    String str2 = iconCompat.f1513j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.f1505b).split(":", -1)[0] : iconCompat.f1513j;
                } else {
                    throw new IllegalStateException("called getResPackage() on " + iconCompat);
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.f1508e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.f1505b, iconCompat.f1508e, iconCompat.f1509f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.f1505b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = e.b((Bitmap) iconCompat.f1505b);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f1505b, false));
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = g.a(iconCompat.d());
                    break;
                } else if (context != null) {
                    Uri d10 = iconCompat.d();
                    String scheme = d10.getScheme();
                    if (!"content".equals(scheme) && !"file".equals(scheme)) {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.f1505b));
                        } catch (FileNotFoundException e13) {
                            Log.w("IconCompat", "Unable to load image from path: " + d10, e13);
                        }
                    } else {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(d10);
                        } catch (Exception e14) {
                            Log.w("IconCompat", "Unable to load image from URI: " + d10, e14);
                        }
                    }
                    if (openInputStream != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            createWithBitmap = e.b(BitmapFactory.decodeStream(openInputStream));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(openInputStream), false));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.d());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.d());
                }
        }
        ColorStateList colorStateList = iconCompat.f1510g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f1511h;
        if (mode != IconCompat.f1503k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
