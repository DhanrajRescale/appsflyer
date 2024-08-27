package zk;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArraySet f42542d = new CopyOnWriteArraySet();

    /* renamed from: a, reason: collision with root package name */
    public final String f42543a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42544b;

    /* renamed from: c, reason: collision with root package name */
    public final List f42545c;

    public c(String str, List list, String str2) {
        this.f42543a = str;
        this.f42544b = str2;
        this.f42545c = list;
    }

    public static final /* synthetic */ CopyOnWriteArraySet a() {
        if (sl.a.b(c.class)) {
            return null;
        }
        try {
            return f42542d;
        } catch (Throwable th2) {
            sl.a.a(c.class, th2);
            return null;
        }
    }

    public final String b() {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            return this.f42543a;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }
}
