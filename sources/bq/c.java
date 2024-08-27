package bq;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements mq.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7246b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f7245a = i10;
        this.f7246b = obj;
    }

    @Override // mq.c
    public final Object get() {
        int i10 = this.f7245a;
        Object obj = this.f7246b;
        switch (i10) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new RuntimeException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(String.format("Could not instantiate %s.", str), e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException(String.format("Could not instantiate %s.", str), e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException(String.format("Could not instantiate %s", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException(String.format("Could not instantiate %s", str), e13);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                Object obj2 = nq.c.f29079m;
                return new oq.b((pp.g) obj);
        }
    }
}
