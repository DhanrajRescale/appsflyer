package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c1 extends e1 {

    /* renamed from: c, reason: collision with root package name */
    public static c1 f1896c;

    /* renamed from: d, reason: collision with root package name */
    public static final kq.e f1897d = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Application f1898b;

    public c1(Application application) {
        this.f1898b = application;
    }

    @Override // androidx.lifecycle.e1, androidx.lifecycle.d1
    public final a1 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Application application = this.f1898b;
        if (application != null) {
            return d(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.e1, androidx.lifecycle.d1
    public final a1 c(Class modelClass, y4.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (this.f1898b != null) {
            return a(modelClass);
        }
        Application application = (Application) extras.a(f1897d);
        if (application != null) {
            return d(modelClass, application);
        }
        if (!AndroidViewModel.class.isAssignableFrom(modelClass)) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return zq.f.D(modelClass);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    public final a1 d(Class modelClass, Application application) {
        if (AndroidViewModel.class.isAssignableFrom(modelClass)) {
            try {
                a1 a1Var = (a1) modelClass.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNullExpressionValue(a1Var, "{\n                try {\n…          }\n            }");
                return a1Var;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e13);
            }
        }
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return zq.f.D(modelClass);
    }
}
