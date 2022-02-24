package com.demo.runningtrackerapp.data.db;

import android.database.Cursor;
import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.demo.runningtrackerapp.data.model.Run;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RunDao_Impl implements RunDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Run> __insertionAdapterOfRun;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<Run> __deletionAdapterOfRun;

  public RunDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRun = new EntityInsertionAdapter<Run>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `running_table` (`image`,`timeStamp`,`avgSpeedInKMH`,`distanceInMeter`,`timeMillis`,`caloriesBurned`,`id`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Run value) {
        final byte[] _tmp = __converters.fromBitMapToByteArray(value.getImage());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindBlob(1, _tmp);
        }
        stmt.bindLong(2, value.getTimeStamp());
        stmt.bindDouble(3, value.getAvgSpeedInKMH());
        stmt.bindLong(4, value.getDistanceInMeter());
        stmt.bindLong(5, value.getTimeMillis());
        stmt.bindLong(6, value.getCaloriesBurned());
        if (value.getId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getId());
        }
      }
    };
    this.__deletionAdapterOfRun = new EntityDeletionOrUpdateAdapter<Run>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `running_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Run value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object insert(final Run run, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRun.insert(run);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Run run, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfRun.handle(run);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<Run>> getAllRunSortedByDate() {
    final String _sql = "SELECT * FROM running_table ORDER BY timeStamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<List<Run>>() {
      @Override
      public List<Run> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeter = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeter");
          final int _cursorIndexOfTimeMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeMillis");
          final int _cursorIndexOfCaloriesBurned = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurned");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<Run> _result = new ArrayList<Run>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Run _item;
            final Bitmap _tmpImage;
            final byte[] _tmp;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getBlob(_cursorIndexOfImage);
            }
            _tmpImage = __converters.fromByteArrayToBitmap(_tmp);
            final long _tmpTimeStamp;
            _tmpTimeStamp = _cursor.getLong(_cursorIndexOfTimeStamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeter;
            _tmpDistanceInMeter = _cursor.getInt(_cursorIndexOfDistanceInMeter);
            final long _tmpTimeMillis;
            _tmpTimeMillis = _cursor.getLong(_cursorIndexOfTimeMillis);
            final int _tmpCaloriesBurned;
            _tmpCaloriesBurned = _cursor.getInt(_cursorIndexOfCaloriesBurned);
            _item = new Run(_tmpImage,_tmpTimeStamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeter,_tmpTimeMillis,_tmpCaloriesBurned);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Run>> getAllRunSortedByTimeInMillis() {
    final String _sql = "SELECT * FROM running_table ORDER BY timeMillis DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<List<Run>>() {
      @Override
      public List<Run> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeter = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeter");
          final int _cursorIndexOfTimeMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeMillis");
          final int _cursorIndexOfCaloriesBurned = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurned");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<Run> _result = new ArrayList<Run>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Run _item;
            final Bitmap _tmpImage;
            final byte[] _tmp;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getBlob(_cursorIndexOfImage);
            }
            _tmpImage = __converters.fromByteArrayToBitmap(_tmp);
            final long _tmpTimeStamp;
            _tmpTimeStamp = _cursor.getLong(_cursorIndexOfTimeStamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeter;
            _tmpDistanceInMeter = _cursor.getInt(_cursorIndexOfDistanceInMeter);
            final long _tmpTimeMillis;
            _tmpTimeMillis = _cursor.getLong(_cursorIndexOfTimeMillis);
            final int _tmpCaloriesBurned;
            _tmpCaloriesBurned = _cursor.getInt(_cursorIndexOfCaloriesBurned);
            _item = new Run(_tmpImage,_tmpTimeStamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeter,_tmpTimeMillis,_tmpCaloriesBurned);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Run>> getAllRunSortedByCaloriesBurned() {
    final String _sql = "SELECT * FROM running_table ORDER BY caloriesBurned DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<List<Run>>() {
      @Override
      public List<Run> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeter = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeter");
          final int _cursorIndexOfTimeMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeMillis");
          final int _cursorIndexOfCaloriesBurned = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurned");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<Run> _result = new ArrayList<Run>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Run _item;
            final Bitmap _tmpImage;
            final byte[] _tmp;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getBlob(_cursorIndexOfImage);
            }
            _tmpImage = __converters.fromByteArrayToBitmap(_tmp);
            final long _tmpTimeStamp;
            _tmpTimeStamp = _cursor.getLong(_cursorIndexOfTimeStamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeter;
            _tmpDistanceInMeter = _cursor.getInt(_cursorIndexOfDistanceInMeter);
            final long _tmpTimeMillis;
            _tmpTimeMillis = _cursor.getLong(_cursorIndexOfTimeMillis);
            final int _tmpCaloriesBurned;
            _tmpCaloriesBurned = _cursor.getInt(_cursorIndexOfCaloriesBurned);
            _item = new Run(_tmpImage,_tmpTimeStamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeter,_tmpTimeMillis,_tmpCaloriesBurned);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Run>> getAllRunSortedByDistance() {
    final String _sql = "SELECT * FROM running_table ORDER BY distanceInMeter DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<List<Run>>() {
      @Override
      public List<Run> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeter = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeter");
          final int _cursorIndexOfTimeMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeMillis");
          final int _cursorIndexOfCaloriesBurned = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurned");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<Run> _result = new ArrayList<Run>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Run _item;
            final Bitmap _tmpImage;
            final byte[] _tmp;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getBlob(_cursorIndexOfImage);
            }
            _tmpImage = __converters.fromByteArrayToBitmap(_tmp);
            final long _tmpTimeStamp;
            _tmpTimeStamp = _cursor.getLong(_cursorIndexOfTimeStamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeter;
            _tmpDistanceInMeter = _cursor.getInt(_cursorIndexOfDistanceInMeter);
            final long _tmpTimeMillis;
            _tmpTimeMillis = _cursor.getLong(_cursorIndexOfTimeMillis);
            final int _tmpCaloriesBurned;
            _tmpCaloriesBurned = _cursor.getInt(_cursorIndexOfCaloriesBurned);
            _item = new Run(_tmpImage,_tmpTimeStamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeter,_tmpTimeMillis,_tmpCaloriesBurned);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Run>> getAllRunSortedByAvgSpeed() {
    final String _sql = "SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<List<Run>>() {
      @Override
      public List<Run> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeter = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeter");
          final int _cursorIndexOfTimeMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeMillis");
          final int _cursorIndexOfCaloriesBurned = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurned");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<Run> _result = new ArrayList<Run>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Run _item;
            final Bitmap _tmpImage;
            final byte[] _tmp;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getBlob(_cursorIndexOfImage);
            }
            _tmpImage = __converters.fromByteArrayToBitmap(_tmp);
            final long _tmpTimeStamp;
            _tmpTimeStamp = _cursor.getLong(_cursorIndexOfTimeStamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeter;
            _tmpDistanceInMeter = _cursor.getInt(_cursorIndexOfDistanceInMeter);
            final long _tmpTimeMillis;
            _tmpTimeMillis = _cursor.getLong(_cursorIndexOfTimeMillis);
            final int _tmpCaloriesBurned;
            _tmpCaloriesBurned = _cursor.getInt(_cursorIndexOfCaloriesBurned);
            _item = new Run(_tmpImage,_tmpTimeStamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeter,_tmpTimeMillis,_tmpCaloriesBurned);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Long> getTotalInMillis() {
    final String _sql = "SELECT sum(timeMillis) FROM running_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Integer> getTotalInCaloriesBurned() {
    final String _sql = "SELECT sum(caloriesBurned) FROM running_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Integer> getTotalInDistanceInMeter() {
    final String _sql = "SELECT sum(distanceInMeter) FROM running_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Float> getTotalAverageSpeed() {
    final String _sql = "SELECT AVG(avgSpeedInKMH) FROM running_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<Float>() {
      @Override
      public Float call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Float _result;
          if(_cursor.moveToFirst()) {
            final Float _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getFloat(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
