package com.satriasayur.app.modules.caritempatbelisayurone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.satriasayur.app.R
import com.satriasayur.app.databinding.RowListrectangletwentynine1Binding
import com.satriasayur.app.modules.caritempatbelisayurone.`data`.model.Listrectangletwentynine1RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangletwentynineAdapter(
  var list: List<Listrectangletwentynine1RowModel>
) : RecyclerView.Adapter<ListrectangletwentynineAdapter.RowListrectangletwentynine1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangletwentynine1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangletwentynine1,parent,false)
    return RowListrectangletwentynine1VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangletwentynine1VH, position: Int) {
    val listrectangletwentynine1RowModel = Listrectangletwentynine1RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangletwentynine1RowModel = list[position]
    holder.binding.listrectangletwentynine1RowModel = listrectangletwentynine1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangletwentynine1RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Listrectangletwentynine1RowModel
    ) {
    }
  }

  inner class RowListrectangletwentynine1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangletwentynine1Binding =
        RowListrectangletwentynine1Binding.bind(itemView)
  }
}
