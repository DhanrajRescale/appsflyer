package m3;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f27291a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f27292b;

    /* renamed from: c, reason: collision with root package name */
    public int f27293c;

    /* renamed from: d, reason: collision with root package name */
    public float f27294d;

    /* renamed from: e, reason: collision with root package name */
    public String f27295e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27296f;

    /* renamed from: g, reason: collision with root package name */
    public int f27297g;

    public a(a aVar, Object obj) {
        aVar.getClass();
        this.f27292b = aVar.f27292b;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, m3.a] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f27459d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i10 = 0;
        boolean z10 = false;
        Object obj = null;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            int i12 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i10 = 6;
            } else {
                int i13 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i13 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, s0.g.f34069a), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, s0.g.f34069a));
                        } else {
                            i13 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i10 = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i12 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i10 = i12;
                            }
                        }
                        i10 = 7;
                    }
                }
                i10 = i13;
            }
        }
        if (str != null && obj != null) {
            ?? obj2 = new Object();
            obj2.f27292b = i10;
            obj2.f27291a = z10;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (w.k.e(this.f27292b)) {
            case 0:
            case 7:
                this.f27293c = ((Integer) obj).intValue();
                return;
            case 1:
                this.f27294d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f27297g = ((Integer) obj).intValue();
                return;
            case 4:
                this.f27295e = (String) obj;
                return;
            case 5:
                this.f27296f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f27294d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
