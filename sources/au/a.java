package au;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m.e3;
import org.jetbrains.annotations.NotNull;
import ut.l;
import ut.n;

/* loaded from: classes2.dex */
public abstract class a implements yt.a, d, Serializable {
    private final yt.a<Object> completion;

    public a(yt.a aVar) {
        this.completion = aVar;
    }

    @NotNull
    public yt.a<Unit> create(@NotNull yt.a<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // au.d
    public d getCallerFrame() {
        yt.a<Object> aVar = this.completion;
        if (aVar instanceof d) {
            return (d) aVar;
        }
        return null;
    }

    public final yt.a<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i10;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i11;
        Intrinsics.checkNotNullParameter(this, "<this>");
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v10 = eVar.v();
        if (v10 <= 1) {
            int i12 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                i10 = i11 - 1;
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                i12 = eVar.l()[i10];
            }
            f.f2796a.getClass();
            Intrinsics.checkNotNullParameter(this, "continuation");
            e3 e3Var = f.f2798c;
            e3 e3Var2 = f.f2797b;
            if (e3Var == null) {
                try {
                    e3 e3Var3 = new e3(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, new Class[0]));
                    f.f2798c = e3Var3;
                    e3Var = e3Var3;
                } catch (Exception unused2) {
                    f.f2798c = e3Var2;
                    e3Var = e3Var2;
                }
            }
            if (e3Var != e3Var2) {
                Method method = e3Var.f25517a;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = e3Var.f25518b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = e3Var.f25519c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = (String) obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i12);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v10 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yt.a
    public final void resumeWith(@NotNull Object obj) {
        yt.a frame = this;
        while (true) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            a aVar = (a) frame;
            yt.a aVar2 = aVar.completion;
            Intrinsics.c(aVar2);
            try {
                obj = aVar.invokeSuspend(obj);
            } catch (Throwable th2) {
                l.Companion companion = l.INSTANCE;
                obj = n.a(th2);
            }
            if (obj == zt.a.f42823a) {
                return;
            }
            l.Companion companion2 = l.INSTANCE;
            aVar.releaseIntercepted();
            if (aVar2 instanceof a) {
                frame = aVar2;
            } else {
                aVar2.resumeWith(obj);
                return;
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    @NotNull
    public yt.a<Unit> create(Object obj, @NotNull yt.a<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
