package jp;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class w extends Binder implements v {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21567b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f21568a;

    public w(Object obj) {
        attachInterface(this, "com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
        this.f21568a = obj;
    }

    public static Object i(v vVar) {
        if (vVar instanceof w) {
            return ((w) vVar).f21568a;
        }
        IBinder asBinder = vVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length != 1) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        Field field = declaredFields[0];
        if (field.isAccessible()) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (IllegalArgumentException e11) {
            throw new IllegalArgumentException("remoteBinder is the wrong class.", e11);
        } catch (NullPointerException e12) {
            throw new IllegalArgumentException("Binder object is null.", e12);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1598968902) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        parcel2.writeString("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
        return true;
    }
}
