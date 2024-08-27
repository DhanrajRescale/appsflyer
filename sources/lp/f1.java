package lp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f1 extends c {
    private static final long serialVersionUID = 0;

    /* renamed from: f, reason: collision with root package name */
    public transient kp.n f24977f;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f24977f = (kp.n) objectInputStream.readObject();
        Map map = (Map) objectInputStream.readObject();
        this.f25046d = map;
        this.f25047e = 0;
        for (Collection collection : map.values()) {
            if (!collection.isEmpty()) {
                this.f25047e = collection.size() + this.f25047e;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f24977f);
        objectOutputStream.writeObject(this.f25046d);
    }
}
