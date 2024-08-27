package f;

import android.content.Intent;
import androidx.activity.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import r3.k;
import vt.o0;
import vt.p0;
import vt.v;
import vt.z;

/* loaded from: classes.dex */
public final class h extends a {
    @Override // f.a
    public final Intent a(m context, Object obj) {
        String[] input = (String[]) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // f.a
    public final t9.c b(m context, Object obj) {
        String[] input = (String[]) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length == 0) {
            return new t9.c(p0.d(), 1);
        }
        for (String str : input) {
            if (k.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        int a10 = o0.a(input.length);
        if (a10 < 16) {
            a10 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
        for (String str2 : input) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new t9.c(linkedHashMap, 1);
    }

    @Override // f.a
    public final Object c(int i10, Intent intent) {
        boolean z10;
        if (i10 != -1) {
            return p0.d();
        }
        if (intent == null) {
            return p0.d();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null && stringArrayExtra != null) {
            ArrayList other = new ArrayList(intArrayExtra.length);
            for (int i11 : intArrayExtra) {
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                other.add(Boolean.valueOf(z10));
            }
            ArrayList p10 = v.p(stringArrayExtra);
            Intrinsics.checkNotNullParameter(p10, "<this>");
            Intrinsics.checkNotNullParameter(other, "other");
            Iterator it = p10.iterator();
            Iterator it2 = other.iterator();
            ArrayList arrayList = new ArrayList(Math.min(z.k(p10), z.k(other)));
            while (it.hasNext() && it2.hasNext()) {
                arrayList.add(new Pair(it.next(), it2.next()));
            }
            return p0.j(arrayList);
        }
        return p0.d();
    }
}
