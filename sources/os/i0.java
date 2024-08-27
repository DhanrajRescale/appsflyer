package os;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class i0 extends k0 {

    /* renamed from: c, reason: collision with root package name */
    public final q.h f30334c;

    /* renamed from: d, reason: collision with root package name */
    public final q.h f30335d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f30336e;

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f30337f;

    public i0(List list, q.h hVar, q.h hVar2) {
        super(list);
        this.f30334c = hVar;
        this.f30335d = hVar2;
        this.f30337f = new Object[1];
        this.f30336e = new WeakHashMap();
    }

    @Override // os.k0
    public final void a(View view) {
        q.h hVar = this.f30334c;
        q.h hVar2 = this.f30335d;
        if (hVar2 != null) {
            Object[] objArr = (Object[]) hVar.f31451c;
            if (1 == objArr.length) {
                Object obj = objArr[0];
                Object a10 = hVar2.a(view, (Object[]) hVar2.f31451c);
                if (obj == a10) {
                    return;
                }
                if (obj != null) {
                    if ((obj instanceof Bitmap) && (a10 instanceof Bitmap)) {
                        if (((Bitmap) obj).sameAs((Bitmap) a10)) {
                            return;
                        }
                    } else if ((obj instanceof BitmapDrawable) && (a10 instanceof BitmapDrawable)) {
                        Bitmap bitmap = ((BitmapDrawable) obj).getBitmap();
                        Bitmap bitmap2 = ((BitmapDrawable) a10).getBitmap();
                        if (bitmap != null && bitmap.sameAs(bitmap2)) {
                            return;
                        }
                    } else if (obj.equals(a10)) {
                        return;
                    }
                }
                if (!(a10 instanceof Bitmap) && !(a10 instanceof BitmapDrawable)) {
                    WeakHashMap weakHashMap = this.f30336e;
                    if (!weakHashMap.containsKey(view)) {
                        Object[] objArr2 = this.f30337f;
                        objArr2[0] = a10;
                        Class<?>[] parameterTypes = ((Method) hVar.f31454f).getParameterTypes();
                        if (objArr2.length == parameterTypes.length) {
                            for (int i10 = 0; i10 < objArr2.length; i10++) {
                                Class b10 = q.h.b(parameterTypes[i10]);
                                Object obj2 = objArr2[i10];
                                if (obj2 == null) {
                                    if (b10 != Byte.TYPE && b10 != Short.TYPE && b10 != Integer.TYPE && b10 != Long.TYPE && b10 != Float.TYPE && b10 != Double.TYPE && b10 != Boolean.TYPE && b10 != Character.TYPE) {
                                    }
                                } else if (b10.isAssignableFrom(q.h.b(obj2.getClass()))) {
                                }
                            }
                            weakHashMap.put(view, a10);
                        }
                        weakHashMap.put(view, null);
                        break;
                    }
                }
            }
        }
        hVar.a(view, (Object[]) hVar.f31451c);
    }

    @Override // os.k0
    public final void b() {
        for (Map.Entry entry : this.f30336e.entrySet()) {
            View view = (View) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                Object[] objArr = this.f30337f;
                objArr[0] = value;
                this.f30334c.a(view, objArr);
            }
        }
    }
}
