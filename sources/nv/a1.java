package nv;

import java.lang.annotation.Annotation;

/* loaded from: classes2.dex */
public final class a1 implements z0 {
    private static final z0 INSTANCE = new a1();

    public static Annotation[] ensurePresent(Annotation[] annotationArr) {
        if (e1.h(annotationArr, z0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = INSTANCE;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return z0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof z0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + z0.class.getName() + "()";
    }
}
