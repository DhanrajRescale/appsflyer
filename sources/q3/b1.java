package q3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b1 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31584a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f31585b;

    public b1(Context context) {
        this.f31585b = context;
    }

    public final void b(Intent intent) {
        this.f31584a.add(intent);
    }

    public final void e(ComponentName componentName) {
        Context context = this.f31585b;
        ArrayList arrayList = this.f31584a;
        int size = arrayList.size();
        try {
            for (Intent b12 = yk.j.b1(context, componentName); b12 != null; b12 = yk.j.b1(context, b12.getComponent())) {
                arrayList.add(size, b12);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public final void g() {
        ArrayList arrayList = this.f31584a;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Context context = this.f31585b;
            if (!r3.k.startActivities(context, intentArr, null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f31584a.iterator();
    }
}
